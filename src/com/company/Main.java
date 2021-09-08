package com.company;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = ".*?\\s(#\\w+).*?";
        String regex1 = ".*?\\s(@\\w+).*?";


        List<String> emails = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern pattern
                = Pattern.compile(regex);
        Pattern pattern1
                = Pattern.compile(regex1);
        Matcher matcher
                = pattern
                .matcher(s);
        Matcher matcher1
                = pattern1
                .matcher(s);
        MatchResult result
                = matcher.toMatchResult();
        System.out.println("hastags: "
                + result);
        MatchResult result1
                = matcher.toMatchResult();
        System.out.println("mentions: "
                + result1);
        while (matcher.find()) {
           emails.add(matcher.group(1));
        }while (matcher1.find()) {
            emails.add(matcher1.group(1));
        }
        Iterator it = emails.iterator();
        while(it.hasNext())
        {
            System.out.println( it.next());
        }
    }
}