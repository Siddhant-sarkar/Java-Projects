package com.sarkarSiddhant.developer;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
//        Map<String, String> programmingLanguage = new HashMap<>();
//        programmingLanguage.put("Java", " High level language which I am learning right now");
//        programmingLanguage.put("C++", "  very low level language which used in game development ");
//        programmingLanguage.put("Python", "  Very much used in  Machine Learning ");
//        programmingLanguage.put("C", "  the mother of all programming Language");
//        programmingLanguage.put("HTML", "  used in weB development very much the backbone of the internet");
//
//
////        System.out.println(programmingLanguage.get("Java"));
////        System.out.println(programmingLanguage.put("Java"," This is what i am learing right now"));
////        System.out.println(programmingLanguage.get("Java"));
////        System.out.println(programmingLanguage.containsKey("Java"));
////        System.out.println("===================================================================================================================");
////        printMap(programmingLanguage);
//
//        programmingLanguage.remove("C", "  the mother of all programming Language");
//        programmingLanguage.replace("C++","Very good programming language for Competetive Coding ");
//        printMap(programmingLanguage);
//        programmingLanguage.put("C", "  the mother of all programming Language");
//        printMap(programmingLanguage);


    }
    public static void printMap(Map<String,String>temp){
        System.out.println("************************************************************************************");
        for (String key:temp.keySet()
             ) {
            System.out.println(key+temp.get(key));
        }
        System.out.println("************************************************************************************");
    }

    }
