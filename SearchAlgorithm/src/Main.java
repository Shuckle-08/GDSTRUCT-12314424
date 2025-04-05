import java.util.*;
import java.util.

public class Main {
    public class ZigzagSortSearch {
        public static List<Integer> zigzagSortSearch(int[] arr) {
            List<Integer> evens = new ArrayList<>();
            List<Integer> odds = new ArrayList<>();

            // Separate evens and odds
            for (int num : arr) {
                if (num % 2 == 0) {
                    evens.add(num);
                } else {
                    odds.add(num);
                }
            }

            // Sort evens in ascending order
            Collections.sort(evens);

            // Sort odds in descending order
            Collections.sort(odds, Collections.reverseOrder());

            // Interleave evens and odds
            List<Integer> result = new ArrayList<>();
            int i = 0, j = 0;
            while (i < evens.size() || j < odds.size()) {
                if (i < evens.size()) {
                    result.add(evens.get(i));
                    i++;
                }
                if (j < odds.size()) {
                    result.add(odds.get(j));
                    j++;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr = {3, 8, 1, 6, 7, 2, 5, 4};
            List<Integer> sortedList = zigzagSortSearch(arr);
            System.out.println(sortedList);
        }
    }

}
