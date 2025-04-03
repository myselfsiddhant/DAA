public class findLargest {
    public static int findLarge(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 78, 99};
        System.out.println("Largest Element: " + findLarge(arr));
    }
}
