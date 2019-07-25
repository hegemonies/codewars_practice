import java.math.BigInteger;

public class SumFct {
	public static BigInteger perimeter(BigInteger n) {
		
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }

        return perimeter(n.subtract(1)) + perimeter(n.subtract(2));
    }

    public static void main(String... args) {
        System.out.println(perimeter(BigInteger.valueOf(7)).compareTo(216));
    }
}