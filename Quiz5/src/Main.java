import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 6, 7, 2, 5, 4};

        List<Integer> sortedList = PJSearch.pjSearch(arr);

        // Print the result
        System.out.println(sortedList);
    }
}
