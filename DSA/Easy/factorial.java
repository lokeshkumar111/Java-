/*
 * Find the Factorial of a goven number using the recurssion 
 * 
 * example :
 * 
 * factorial of 5 is 5! = 5*4*3*2*1 = 120
 * 
 */

import java.util.*;

class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factor(n));
    }

    public static int factor(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }
}
