/*
Given an array arr[] of size N and a number K, the task is to find the smallest number M such that the sum of the array becomes lesser than or equal to the number K when every element of that array is divided by the number M.

Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For example: 10/3 = 4 and 6/2 = 3
Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of arr[]

Constraints:
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 100000000
Output
Print a single integer the value of smallest number M
Sample Input:
4 6
2 3 4 9

Sample Output:
4

Explanation:
When every element is divided by 4 - 2/4 + 3/4 + 4/4 + 9/4 = 1 + 1 + 1 + 3 = 6
When every element is divided by 3 - 2/3 + 3/3 + 4/3 + 9/3 = 1 + 1 + 2 + 3 = 7 which is greater than K.
Hence the smallest integer which makes the sum less than or equal to K = 6 is 4.
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class K_sum {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print(binary(arr, K));
    }
    private  static  int binary(int[] arr,long k){
       int max = 0;
       for(int x : arr){
           max = Math.max(max ,x);
       }
       int ans = findAns(arr, 0 , max , k);
       return ans;
    }

    private static  int findAns(int[] arr,int start ,int end ,long k){
        
        if(start>end) return start;
        int mid  =start+(end-start)/2;
        int getVal = findDivider(arr, mid);
        int x = mid;
        if(getVal<=k){
            end =  x;
       
        }
        
        if(getVal >k)
            return  findAns(arr, mid+1 ,end ,k );
        else
            return findAns(arr  , start, mid-1,k);

    }
    private static int findDivider(int[] arr, int mid){

        int sum=0;
        for(int x : arr){
          
            sum +=   Math.ceil((x*1.0)/mid);
            
        }
        return sum;
    }
}