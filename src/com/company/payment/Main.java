package com.company.payment;

import com.company.payment.modules.AddWordReg;
import com.company.payment.modules.VowelsConsonants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Game of Thrones is an American fantasy drama television series created by David Benioff. It is an adaptation of A Song of Ice and Fire, George Martin's series of fantasy novels, the first of which is A Game of Thrones. It is filmed in Belfast and elsewhere in the United Kingdom, Canada, Croatia, Iceland, Malta, Morocco, Spain, and the United States. The series premiered on HBO in the United States on April 17, 2011, and its seventh season ended on August 27, 2017. The series will conclude with its eighth season premiering in 2019.";
        AddWordReg addWord = new AddWordReg("cat richcat act act cat   ");
        VowelsConsonants vovelCons = new VowelsConsonants(text);
        System.out.println(addWord.FindAndAddWord("help"));
        vovelCons.Statistics();
    }
}
