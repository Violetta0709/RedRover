package org.veta;

public class HW6 {
    public static void main(String[] args) {

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        System.out.println(sum);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println(min);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println(max);


        int avg = 0;
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            avg = sum1 / array1.length;
        }
        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            count++;
        }

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, 6}};
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
            }
        }
        System.out.println(sum2);

        int max1 = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (max1 < array2[i][j]) {
                    max1 = array2[i][j];
                }
            }
        }
        System.out.println(max1);

        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (min1 > array2[i][j]) {
                    min1 = array2[i][j];
                }
            }
        }
        System.out.println(min1);

        int count1 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                count1++;
            }
        }
        System.out.println(count1);
    }
}
