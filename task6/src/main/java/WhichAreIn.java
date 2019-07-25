import java.util.ArrayList;
import java.util.Arrays;

import java.util.Set;
import java.util.HashSet;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new HashSet<>();
     
        for(String a1 : array1) {
            for(String a2 : array2) {
                if(a2.contains(a1)) {
                    result.add(a1);
                    break;
                }
            }
        }
        
        String[] resultArray = result.toArray(new String[result.size()]);
        
        Arrays.sort(resultArray);
        
        return resultArray;
    }

    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println(Arrays.toString(inArray(a, b)));
    }
}
