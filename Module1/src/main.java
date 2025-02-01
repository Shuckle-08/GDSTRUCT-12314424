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

        bubbleSort(numbers);

        //after BubbleSort
        System.out.print("\n\nAfter Bubble Sort: ");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] nums) {
        for (int unsortedPartitionIndex = nums.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){
            for (int i = 0; i < unsortedPartitionIndex; i++) {
                if (nums[i] > nums[i + 1]){
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] nums){
        int largest = 0;

        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = largest + 1; i<= lastUnsortedIndex; i++){
                if (nums[i] > nums[largest]){
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

    private static void printArrayElements(int[] nums){
//        for (int i = 0; i < nums.length; i++){
        for (int num : nums)
            System.out.print(num + " ");
    }
}
