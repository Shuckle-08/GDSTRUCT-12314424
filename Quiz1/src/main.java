public class main {
    public static void main(String[] args){
        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        //before BubbleSort
        System.out.print("Before Bubble Sort: ");
        printArrayElements(numbers);

        System.out.print("\n");
        bubbleSortDescending(numbers);

        //after BubbleSort
        System.out.print("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);

        //before SelectionSort
        System.out.print("\n\nBefore Selection Sort: ");
        printArrayElements(numbers);

        System.out.print("\n\n");
        SelectionSortModified(numbers);

        //after SelectionSort
        System.out.print("\n\nAfter Selection Sort: ");
        printArrayElements(numbers);
    }

    private static void bubbleSortDescending(int[] nums) {
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (nums[i] < nums[i + 1]){
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortDescending(int[] nums){
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for (int i = largest + 1; i<= lastUnsortedIndex; i++){
                if (nums[i] < nums[largest]){
                    largest = i;
                }
            }

            if (largest != lastUnsortedIndex){
                int temp = nums[largest];
                nums[largest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void SelectionSortModified(int[] nums){
        int smallest;

        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            smallest = 0;
            for (int i = 1; i<= lastUnsortedIndex; i++){
                if (nums[i] < nums[smallest]){
                    smallest = i;
                }
            }

            if (smallest != lastUnsortedIndex){
                int temp = nums[smallest];
                nums[smallest] = nums[lastUnsortedIndex];
                nums[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void printArrayElements(int[] nums){
        for (int num : nums)
            System.out.print(num + " ");
    }
}
