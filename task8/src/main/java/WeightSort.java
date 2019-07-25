import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeightSort {
    public static String orderWeight(String strng) {
        Map<Integer, String> strNumbers = new HashMap<>();

        String[] strNmbrs = strng.split(" ");
        Integer[] numbers = new Integer[strNmbrs.length];

        int i = 0;
        for (String strNmbr : strNmbrs) {
            Integer accum = 0;
            String[] subnumbers = strNmbr.split("");

            for (String subnumber : subnumbers) {
                int tmp = Integer.parseInt(subnumber);
                accum += tmp;
            }

            System.out.println("accum = " + accum.toString());;

            strNumbers.put(accum, strNmbr);

            numbers[i] = accum;
            i++;
        }

        Arrays.sort(numbers);

        String result = "";

        for (int number : numbers) {
            result += strNumbers.get(number);
            if (number != numbers[numbers.length - 1]) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(orderWeight("103 123 4444 99 2000") + ".");
        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123") + ".");
    }
}
