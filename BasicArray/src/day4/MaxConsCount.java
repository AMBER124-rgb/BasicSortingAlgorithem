package day4;

public class MaxConsCount {

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 1 };
        int count = maxCount(arr);
        System.out.println("Maximum Consecutive count of 1 in given array: " + count);
    }

    private static int maxCount(int[] arr) {
        int n = arr.length;
        int count = 0, res = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0; // Reset count when a 0 is encountered
            }
        }
        return res;
    }
}
