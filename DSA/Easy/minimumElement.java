// We have to find the smallest element in the the array. 

import java.util.Scanner;

public class minimumElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // Length of the array
        int[] arr = new int[m]; // array of the length n
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt(); // fill the values in the array
        }
        int min = Integer.MAX_VALUE; // taking a minimum value
        for (int i = 0; i < m; i++) {
            if (arr[i] < min) {
                min = arr[i]; // after each iteration it modifies the value of the min.
            }
        }
        System.out.println(min); // It return the minimun value
    }
}
