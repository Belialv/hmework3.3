package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменные");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
    }
}
