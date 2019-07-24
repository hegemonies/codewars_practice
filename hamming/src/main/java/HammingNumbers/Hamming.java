package HammingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Hamming {
    private static long getHammingNumber(int c2, int c3, int c5) {
        return (long) (Math.pow(2, c2) * Math.pow(3, c3) * Math.pow(5, c5));
    }

    public static long hamming(int n) {
        int N = 5000;
        List<Long> hammingNumbers = new ArrayList<Long>();
        int count2 = 0;
        int count3 = 0;
        int count5 = 0;

        hammingNumbers.add(getHammingNumber(0, 0, 0));

        // for 5
        for (int i = 1; i <= 15; i++) {
            hammingNumbers.add(getHammingNumber(0, 0, i));
        }

        // for 3
        for (int i = 1; i <= 16; i ++) {
            hammingNumbers.add(getHammingNumber(0, i, 0));
        }

        // for 2
        for (int i = 1; i <= 21; i ++) {
            hammingNumbers.add(getHammingNumber(i, 0, 0));
        }



        return 0;
    }

    public static void main(String... args) {

    }
}