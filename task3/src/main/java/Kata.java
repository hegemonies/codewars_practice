public class Kata {
    public static double findUniq(double arr[]) {
        double nonUnique = 0.0;
        double unique = 0.0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                nonUnique = arr[i];
                break;
            }
        }

        for (double num : arr) {
            if (num != nonUnique) {
                unique = num;
                break;
            }
        }
        return unique;
    }
}
