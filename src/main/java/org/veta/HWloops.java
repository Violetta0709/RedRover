package org.veta;

public class HWloops {
    public void time() {
        OUTER:
        for (int hour = 0; hour <= 23; hour++) {
            System.out.println("Start of outer loop");
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + ":" + minute);
                if (minute == 30) {
                    break OUTER;
                }
            }
            System.out.println("End of outer loop");
        }
    }
    public static void main(String[] args) {
        HWloops h = new HWloops();
        h.time();
    }
}


