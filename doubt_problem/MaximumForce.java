/*

Given an array A of size n, and an integer k. Find the maximum force by involving only k elements. Force of an element is the square of its value.

Note: Elements are not needed to be continuous.
Input
The first line of the input contains two integers denoting n and k.
Next line contains n integers denoting elements of the array.

Constraints:
1 < = k < = n < = 1000
-10^7 <= A[i] <= 10^7
Output
Output the maximum force.
Examples
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
class Main {
	public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
	   int N = scanner.nextInt();
	   int D = scanner.nextInt();
	   int a[]=new int[N];
	   for(int i=0;i<N;i++)
	    a[i]=scanner.nextInt();

		quickSort(a,0,a.length-1);
		long  ans=0;
		for(int i=N-1;i>=0 && D>0;i--){
          ans+=a[i] * a[i];
		  D--;
		}
		System.out.print(ans);
	}
	private static void quickSort(int[] arr, int start ,int end){
		if(start>end) return;
		int p=partition(arr,start,end);
		quickSort(arr,start,p-1);
		quickSort(arr,p+1,end);
	}
	private static int partition(int[] arr,int start ,int end){
		int pivot = arr[end];
		int pivot_idx=start;
		for(int i=start;i<=end-1;i++){
			if(arr[i]<=pivot){
				swap(arr,i,pivot_idx);
				pivot_idx++;
			}

		}
		swap(arr,pivot_idx,end);
		return pivot_idx;
	}
	private static void swap(int[] arr, int a , int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}