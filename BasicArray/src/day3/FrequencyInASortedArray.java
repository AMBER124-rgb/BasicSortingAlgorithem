package day3;

public class FrequencyInASortedArray {

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 20, 30, 30, 40 };
        freqArray(arr);
    }

    private static void freqArray(int[] arr) {
        int n = arr.length, freq = 1, i = 1;
        while (i < n) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            } else {
                System.out.println(arr[i - 1] + " " + freq);
                freq = 1;
            }
            i++;
        }
        // Print the frequency of the last element
        System.out.println(arr[n - 1] + " " + freq);
    }
}
