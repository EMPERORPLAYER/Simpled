package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hi everyone and discord");
//        System.out.println("Я наївся");
//
//        boolean b = true;
//        System.out.println("b = " + b);
//
//        char ch = 'a';
//        String str = "Let`s go Japan";
//        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What`s your name?");
        System.out.println("->_");
        String str = scanner.nextLine();
        System.out.println("Hi Mr "+str+"!");
    }
}