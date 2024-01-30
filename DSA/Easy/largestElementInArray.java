// We have to find the largest element in the the array. 

import java.util.Scanner;

class largestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Length of the array
        int[] arr = new int[n]; // array of the length n
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // fill the values in the array
        }
        int min = Integer.MIN_VALUE; // taking a minimum value
        for (int i = 0; i < n; i++) {
            if (arr[i] > min) {
                min = arr[i]; // after each iteration it modifies the value of the min.
            }
        }
        System.out.println(min); // It return the minimum value
    }
}