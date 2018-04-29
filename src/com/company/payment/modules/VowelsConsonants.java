package com.company.payment.modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelsConsonants {
    private String input;

    private String[] FindCount() {
        Pattern p = Pattern.compile("((\\w|\\s|\\,|\\')+)(\\.)");
        Matcher m = p.matcher(getInput());
        String[] sb = new String[5];
        int sentenseCount = 0;
        while (m.find()) {
            System.out.println(m.group());
            sb[sentenseCount] = m.group();
            sentenseCount++;
        }
        return sb;
    }

    public void Statistics() {
        String[] sb = FindCount();
        String regex2 = "([aeyuio])";
        String regex3 = "([^aeyuio])";
        for (String i : sb) {
            Pattern p1 = Pattern.compile(regex2);
            Matcher m1 = p1.matcher(i);
            int vovelsCount = 0;
            int consonantsCount = 0;
            while (m1.find()) {
                vovelsCount++;
            }
            Pattern p2 = Pattern.compile(regex3);
            Matcher m2 = p2.matcher(i);
            while (m2.find()) {
                consonantsCount++;
            }
            System.out.println("В предложении " + i + "\n" + "гласных :" + vovelsCount + " согласных :" + consonantsCount);
        }
    }

    public VowelsConsonants(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
