public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int nonZeroPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPos++] = nums[i];
            }
        }
        while (nonZeroPos < nums.length) {
            nums[nonZeroPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.print("Array after moving zeros: ");
        for (int num : arr) System.out.print(num + " ");
    }
}