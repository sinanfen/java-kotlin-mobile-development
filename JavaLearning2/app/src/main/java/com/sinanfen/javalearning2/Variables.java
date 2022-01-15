package com.sinanfen.javalearning2;

public class Variables {

    public static void main(String[] args){
        //Variablas * degiskenler

        int age = 100;
        System.out.println(10 * age);
        System.out.println(age / 10);

        //Double - float
        double a = 11.0;
        double z = 5.0;

        System.out.println(a/z);

        //Float bu şekilde tanımlanır. Sonuna "f" harfi konulur
        float myFloat = 10.0f;

        double pi = 3.14;
        int r = 5;
        System.out.println(2*r*pi);

        //String metinsel ifadeler
        String name = "sinan";
        String surname = "fen";

        System.out.println(name + " " +surname);


        //Boolean - true * false
        boolean isAlive = true;

        isAlive = false;
        System.out.println(isAlive);

        //Final
        final int myInteger = 5;
        //eğer final yazarsam o sabit olur ve değiştirilemez.
        System.out.println("myInteger: " + myInteger);

        //myInteger = 4;
        //System.out.println("myInteger: " + myInteger);
    }
}
