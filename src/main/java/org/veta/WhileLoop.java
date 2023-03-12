package org.veta;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);


        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a%3==0 && a%7==0) {
                b=false;
            }
            a++;
        }
    }
}
