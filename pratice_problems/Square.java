/**
 * Given an integer N. The task is to find the square root of N. If N is not a perfect square, then return floor(√N).

Try to solve the problem using Binary Search.
Input
The first line of input contains number of testcases T. For each testcase, the only line contains the number N.

Constraints:
1 ≤ T ≤ 10000
0 ≤ x ≤ 100000000
Output
For each testcase, print square root of given integer.

Sample Input:
2
5
4

Sample Output:
2
2

Explanation:
Testcase 1: Since, 5 is not perfect square, so floor of square_root of 5 is 2.
Testcase 2: Since, 4 is a perfect square, so its square root is 2.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this classa
// you can add inner classes if needed
class Main {
	public static void square (String[] args) {
        Scanner scanner = new Scanner (System.in);
		int textCase = scanner.nextInt();
		while(textCase>0){
			long N = scanner.nextLong();
			System.out.println(squareRoot(N,0,N));
			textCase--;
		}
	}
	private static long squareRoot(long N , long start , long end){
		if(start>end) return end;

		long mid = (start + end)/2;

		long sq = mid * mid;

		if(sq> N){
		  return	squareRoot(N , start , mid-1);
		}else if(sq < N){
		 return	squareRoot(N , mid+1 , end);
		}else{
			return mid;
		}
	}
}