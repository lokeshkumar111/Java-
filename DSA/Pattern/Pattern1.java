/*                                              --------------------
                                                    Pattern : 1
                                                --------------------
print the following pattern :- 

n=6
* * * * * 
* * * * 
* * * 
* * 
*

 */

// package DSA.Pattern;

// import java.util.*;

// public class Pattern1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = n - 1; i > 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }

// }

// ------------------------------------------------------------------------------------------------------------------------------

/*                                              --------------------
                                                    Pattern : 2
                                                --------------------
print the following pattern :- 

n=6
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * * * 

 */

package DSA.Pattern;

import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
