public class Main {
    public static void main(String[] args){
        int[] nums = {-100, -50, -12, 5, 16, 42, 55, 108};

        int searchValue = 55;
        int index = linearSearch(nums, searchValue);
        System.out.println(searchValue + " is in index " + index);
    }

    private static int linearSearch(int[] nums, int value){
        for (int i = 0; i < nums.length; i++){
            if (value == nums[i]){
                return i;
            }
        }

        return -1;
    }
    
}
