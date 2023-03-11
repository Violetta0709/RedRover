package org.veta;

public class HW4 {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("Task 2");
        for (int i = 1; Math.pow(5, i) < 10000; i++) {
            System.out.println(Math.pow(5, i));
        }

        //Task 3
        System.out.println("Task 3");

        System.out.println("Option 1");
        for (int i = 40; i <= 60; i += 4) {
            System.out.println(i);
        }

        int a = 40;
        while (a <= 60) {
            a++;
            if (a % 4 == 0) {
                System.out.println(a);
            }
        }

        System.out.println("Option 2");
        int b = 40;
        do {
            System.out.println(b);
            b += 4;
        }
        while (b <= 60);

        System.out.println("Option 3");
        for (int i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
