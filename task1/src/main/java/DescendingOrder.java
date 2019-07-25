import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num == 0) {
            return 0;
        }

        int length = (int)(Math.log10(num) + 1);

        ArrayList<Integer> arr = new ArrayList<>();

        int _num = num;

        for (int i = 0; i < length; i++) {
            arr.add(_num % 10);
            _num /= 10;
        }

        arr.sort(Integer::compareTo);

        Collections.reverse(arr);

        _num = 0;

        for (int i = 0, j = length - 1; i < length; i++, j--) {
            _num += arr.get(i) * (j == 0 ? 1 : (Math.pow(10, j)));
        }

        return _num;
    }
}
