package com.sinanfen.javalearning2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args){
        //3 elemanlı bir dizi
        String[] myStringArray = new String[3];
        myStringArray[0] = "James";
        myStringArray[1] = "Clerk";
        myStringArray[2] = "Maxwell";
        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        System.out.println(myIntegerArray[0]);


        int[] myNumberArray = {1,2,3,4,5};
        System.out.println(myNumberArray[2]);

        //Lists
        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk"); //Farklı bir add metoduyla 1 nolu indexe ekler
        myMusicians.add("Rob");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        //Set - aynı veriden sadece bir kere kabul eder
        HashSet<String> mySet = new HashSet<>();
        mySet.add("James");
        mySet.add("James");
        System.out.println(mySet.size());

        //HashMap -- verinin ne olduğunu döndürüyor get ve set.
        HashMap<String,String> myHashMap = new HashMap<>();
        myHashMap.put("name","james");
        myHashMap.put("instrument","guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        //Küçük int kabul etmiyor (primitive) bu yüzden sınıfın adıyla Integer integer şeklinde verdik.
        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run",200);
        mySecondMap.put("basketball",1200);
        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));
    }
}
