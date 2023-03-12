package org.veta;

public class Nloops {

    public static void showtime() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            INNER1:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }

                INNER2:
                for (int second = 0; second < 60; second++) {
                    if (second * hour > minute) {
                        continue INNER1;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        showtime();
    }
}
