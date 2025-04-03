public class DivideEqualPairs {
    public static boolean canDivide(int[] nums) {
        if (nums.length % 2 != 0) return false;

        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 2, 2};
        System.out.println("Can divide into equal pairs: " + canDivide(arr));
    }
}