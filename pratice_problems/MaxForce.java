/**
 * Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. Force of an element is the square of its value.

Note: Elements are not needed to be continuous.
Input
The first line of the input contains two integers denoting n and k.
Next line contains n integers denoting elements of the array.

Constraints:
1 < = k < = n < = 1000
-10^7 <= A[i] <= 10^7
Output
Output the maximum force.
Sample Input:
4 4
1 2 3 4

Output:
30

Explanation:
Force = 1*1 + 2*2 + 3*3 + 4*4 = 30

Sample Input:
2 1
1 10

Sample Output:
100

 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxForce {
	
	public static void main (String[] args){
		//  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long D = scanner.nextLong();
        long arr[] = new long[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextLong();
        }
        if(D>N){
            System.out.print(Integer.MAX_VALUE);
            return ;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = Math.abs(arr[i]);
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=N-1;i>=0  && D>0   ;i--){
            ans+=arr[i] * arr[i];
            D--;
        }
        System.out.print(ans);
    }
	
}