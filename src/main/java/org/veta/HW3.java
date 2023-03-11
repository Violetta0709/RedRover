package org.veta;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        //Task 1 тк условия взаимосключащие, то элегантнее с else if
        int a = 3;
        int b = 5;
        if (a == b) {
            System.out.println("a==b");
        } else if (a < b) {
            System.out.println("a<b");
        } else if (a > b) {
            System.out.println("a>b");
        }
        //Task 2
        int c = 2;
        int d = 3;

        if ((c + d) % 2 == 0) {
            System.out.println("maybe a and b are even");
        }
        else {
            System.out.println("some variable is odd");
        }
        //Task 3
        int e = 12;
        if (e > 10) {
            System.out.println("больше 10");
        }
        if (e < 100) {
            System.out.println("меньше 100");
        }
        if (e / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }
        if (e >= 5 && e <= 40) {
            System.out.println("Значение переменной между 5 и 40 включительно");
        }
        if (e < 5 || e > 40) {
            System.out.println("Значение переменной меньше 5 или больше 40");
        }
    }
}
