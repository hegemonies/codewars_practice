package HammingNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Hamming {
    private static List<Long> hammingNumbers = new ArrayList<Long>();
    static int count2 = 20;
    static int count3 = 15;
    static int count5 = 14;

    static {
        // for 2
        for (int i = 0; i <= count2; i++) {
            // for 3
            for (int j = 0; j <= count3; j++) {
                // for 5
                for (int k = 0; k <= count5; k++) {
                    hammingNumbers.add(getHammingNumber(i, j, k));
                }
            }
        }


        hammingNumbers = hammingNumbers.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    private static long getHammingNumber(int c2, int c3, int c5) {
        return (long) (Math.pow(2, c2) * Math.pow(3, c3) * Math.pow(5, c5));
    }

    public static long hamming(int n) {
        System.out.println(hammingNumbers);
        System.out.println(hammingNumbers.size());

        return hammingNumbers.get(n -1 );
    }

    public static void main(String... args) {
        System.out.println(hamming(582));
    }
}