/**
 * 
Fibonacci numbers are interesting but Tribonacci numbers are more interesting.
A Tribonacci number T(n) is the sum of the preceding three elements in a series. Consider its first three numbers to be 0, 0, and 1. i. e T(1) = 0, T(2) = 0, T(3) = 1.
Given a number N, your task is to return the nth Tribonacci number.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 20
Output
Return the Nth Tribonacci number.
Sample Input:-
4

Sample Output:-
1

Sample Input:-
7

Sample Output:-
7
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Tribonacci {
	public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        System.out.print(tribonacci(n));
	}
    private static int tribonacci(int n){
        if(n<=2) return 0 ;
        if(n == 3) return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
}