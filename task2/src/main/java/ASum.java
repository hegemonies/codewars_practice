

public class ASum {

    public static long findNb(long m) {
        int n = 0;
        long _m = 0;

        while (_m < m) {
            n++;
            _m += Math.pow(n, 3);
        }

//        if (_m > m) {
//            n = -1;
//        }

        return n;
    }
}