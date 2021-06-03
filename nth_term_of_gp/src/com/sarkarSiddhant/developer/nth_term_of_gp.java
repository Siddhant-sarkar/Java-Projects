package com.sarkarSiddhant.developer;

import java.util.Scanner;

public class nth_term_of_gp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter th");
        int number =200;
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int n = sc.nextInt();
        int r = a2 / a1;
        int an = a1 * (int) (Math.pow(r, (n - 1)));
        number=50;
        System.out.println(an);
        sc.close();
        //this is a multiline commnet and iam gouing to fill the whole page with this single line comment saying
        //that this is a multiline comment and finally finding the true meaning 
    }
}

        /*
Given the first two terms, a1 and a2, of an G.P. (Geometric Progression), and an integer n, find the value of nth term in the G.P.
Sample Input:
a1 = 1
a2 = 2
n=4
Sample Output:
8
Explanation:
The G.P. for this example would be - 1, 2, 4, 8, 16, ...
Time complexity : O(1)
Space complexity: O(1)
*/
    
