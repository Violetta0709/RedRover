package org.veta;

import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {
       /* for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        int[] arr = {10, 100, 1000, 10000, 100000};

        int[] arr1 = new int[6];
        for (int i = 0, p = 5; i < arr1.length; p *= 5, i++) {
            arr1[i] = p;
        }
        System.out.println(Arrays.toString(arr1));

        int q = 1;
        for (int i = 0; i < arr1.length; i++) {
            q *= 5;
            arr1[i] = q;
        }
        System.out.println(Arrays.toString(arr1));

        int[][] arr5 = {
                {1, 10, 100},
                {2, 20},
                {3, 30, 300, 3000}
        };

        System.out.println(Arrays.deepToString(arr5));
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) { //длина каждого вложенного массива
                System.out.println(arr5[i][j]);
            }
        }

        for (int a =1; a < 10; a++) {
            System.out.println("Считаем для множителя " + a);
            for (int b =1; b<10; b++) {
                System.out.println(a+ " x " + b + " = " + (a*b));
            }
        }*/

        for (int i = 10; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //for (int i )

    }
    /*int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
    int[] arr3 = {1, 2, 3, 4, 5, 6, 7};*/

}
