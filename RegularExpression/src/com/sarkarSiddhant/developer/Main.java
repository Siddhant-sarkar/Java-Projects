package com.sarkarSiddhant.developer;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IndexOutOfBoundsException {
	    String abcd="THis is the string THis";
	    String name="SiddhantSarkar462564587628";

//        System.out.println(abcd.replaceAll("string","Fyck"));
//        System.out.println(abcd.matches("THis"));
//        System.out.println(abcd.replaceAll("THis","REplaced"));
       abcd= abcd.replaceAll("[asg]","*");

        System.out.println(abcd.replaceAll("[asg]","*"));
        System.out.println(abcd.replaceAll("[i][*]","##"));
        System.out.println(name.replaceAll("[Ss]iddhant","Sarkar"));
        System.out.println(name.replaceAll("[^S]","  "));
        System.out.println(name.replaceAll("\\d","there was a digit here"));
        System.out.println(name.replaceAll("\\D","*"));

        String string="I have blanks and \t tab and an new line\nat the end";
        System.out.println(string.replaceAll("\\s",""));
        System.out.println(string.replaceAll("\\W","*"));
        System.out.println(string.replaceAll("\\b",""));

        StringBuilder builder=new StringBuilder("THis is a sample string ");
        builder.append("<THis> is temp1");
        builder.append("<THis> is temp2");
        builder.append("<THis> is temp3");
        builder.append("<THis> is temp4");
        builder.append("<THis> is temp5");

        String temp="THis";
        Pattern pattern=Pattern.compile(temp);
        Matcher matcher = pattern.matcher(builder);
        System.out.println(matcher.matches());

    }
}
