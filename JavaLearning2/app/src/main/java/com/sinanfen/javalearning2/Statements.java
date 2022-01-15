package com.sinanfen.javalearning2;

public class Statements {

    public static void main    (String[] args){
        int x = 5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=x*5;
        System.out.println(x);


        int y = 4;
        System.out.println(x>y);
        System.out.println(y>x);
        y=30;
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        // and  ve==> &&
        // or veya => ||

        x=5;
        y=5;
        int z =5;
        System.out.println(x<y && y<z);

        //If statements
        if (x>y){
            System.out.println("x is bigger");
        }else if(y>x){
            System.out.println("y is bigger");
        }else{
            System.out.printf("x = y");
        }

        //Switch
        int day =1;
        String dayString="";
        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println("\n" + dayString);
    }
}
