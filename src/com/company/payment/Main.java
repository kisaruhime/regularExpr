package com.company.payment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static String REGEX = "(\\b|.)(cat)\\s";
    private static String INPUT = "cat richcat act act cat   ";
    private static String REPLACE = "help";

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group()+REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }
}
