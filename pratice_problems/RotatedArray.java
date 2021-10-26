/**
 * The second line of each test case contains N space separated integers denoting array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^5
1 <= A[i] <= 10^6

Sum of "N" over all testcases does not exceed 10^5
Output
Corresponding to each test case, in a new line, print the minimum element in the array.
Example
Input:
3
10
2 3 4 5 6 7 8 9 10 1
5
3 4 5 1 2
8
10 20 30 45 50 60 4 6

Output:
1
1
4

Explanation:
Testcase 1: The array is rotated once anti-clockwise. So minium element is at last index (n-1) which is 1.
Testcase 2: The array is rotated and the minimum element present is at index (n-2) which is 1.
Testcase 3: The array is rotated and the minimum element present is 4.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RotatedArray {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
		int textCast = scanner.nextInt();
		while(textCast>0){
			int n = scanner.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++)
			  arr[i]=scanner.nextInt();
			  print(arr);
			textCast--;
		}
	}
	private static void print(int[] arr){
		int ans =arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<ans){
				
				ans=arr[i];
			}
		}
		System.out.println(ans);
	}
	
}