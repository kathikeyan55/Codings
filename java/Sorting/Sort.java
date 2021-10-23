/*
Given an array A of size N containing 0's, 1's and 2's. The task is to segregate the 0's, 1's and 2's in the array as all the 0's should appear in the first part of the array, 1's should appear in middle part of the array and finally all the 2's in the remaining part of the array.

Note: Do not use inbuilt sort function. Try to solve in O(N) per test case
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
		int testCase=scanner.nextInt();
		while(testCase>0){

			int N=scanner.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		 arr[i]=scanner.nextInt();

		 sort_0_1_2(arr);

		 for(int x: arr)
		    System.out.print(x+" ");


			System.out.println();
			testCase--;
		}
		
		scanner.close();	
	}
	private static void sort_0_1_2(int[] arr){
		int start=0;
		int end = arr.length-1;
		int idx=0;
		while(idx<=end){
			if(arr[idx]==0){
				swap(arr,idx,start);
				idx++;
				start++;
			}else if(arr[idx]==1){
				idx++;
			}else{
				swap(arr,idx,end);
				end--;
			}
		}
		}
	
	
	private static void swap(int arr[],int a, int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}