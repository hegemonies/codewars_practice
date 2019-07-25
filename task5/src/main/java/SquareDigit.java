public class SquareDigit {
    public static int squareDigits(int n) {
        String[] digits = String.valueOf(n).split("");
        String result = "";

        for (String digit : digits) {
            Double tmp = Math.pow(Integer.parseInt(digit), 2);
            Integer _tmp = tmp.intValue();
            digit = _tmp.toString();
            result += digit;
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println("result = " + squareDigits(9119));
    }
}
