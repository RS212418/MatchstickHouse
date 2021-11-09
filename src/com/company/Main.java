package com.company;

import java.util.Scanner;

public class Main {

    public static int matchsticks(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many houses do you want");
        return input.nextInt();
    }

    public static int houses(){
        int house = (((matchsticks()-1) * 5) +6);
        return house;
    }


    public static void main(String[] args) {
        System.out.println("You need " + houses() + " matchsticks");
    }
}
