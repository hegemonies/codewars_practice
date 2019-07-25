public class Main {
    public static void main(String[] args) {
        long M = 1833605279970512400L;
//        System.out.println(2022 == ASum.findNb(4183059834009L));
        System.out.println("findNb(" + M + ") = " + ASum.findNb(M));

        long m = 0;
        int n = 52040;

//        for (int i = 1; i < n + 1; i++) {
//            m += Math.pow(i, 3);
//        }

        while (n > 0) {
            m += Math.pow(n, 3);
            n--;
        }

        System.out.println("test m = " + m);
        System.out.println("test m - real m = " + (m - M));
    }
}
