package com.company.payment.modules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddWordReg {
    private String input;

    public StringBuffer FindAndAddWord(String replace) {
        Pattern p = Pattern.compile("(\\b|.)(cat)");
        Matcher m = p.matcher(getInput());
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group() + replace);
        }
        m.appendTail(sb);
        return sb;
    }

    public AddWordReg(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
