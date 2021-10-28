/**
 * 
Given an integer K and an array height[] of size N, where height[i] denotes the height of the ith tree in a forest. The task is to make a cut of height X from the ground such that at max K unit wood is collected. Find the minimum value of X

If you make a cut of height X from the ground then every tree with a height greater than X will be reduced to X and remaining part of wood can be collected
Input
The first line contains two integers N and K.
Next line contains N integers denoting the elements of the array height[]

Constraints
1 <= N <= 100000
1 <= arr[i] <= 100000
1 <= K <= 10000000
Output
Print a single integer the value of X.
Sample Input:
4 2
1 2 1 2

Sample Output:
1

Explanation:
Make a cut at height 1, the updated array will be {1, 1, 1, 1} and
the collected wood will be {0, 1, 0, 1} i. e. 0 + 1 + 0 + 1 = 2.
 */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinCutTree {
	 public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
//        Arrays.sort(arr);
        System.out.print(treeCutter(arr,K));


    }
    private static int treeCutter(int[] height  , int K ){

        int max = 0 ;
        for(int x :  height){
            max= Math.max(max , x);
        }
        return binarySearch(height , 0 , max , K);

    }

    private static int binarySearch(int[] height, int start, int end, int k) {
        if(start>end) return  start;
        int mid = (start + end)/2;
        int ans = cutter(height , mid);
        if(ans == k) return  mid;
        if(ans>k)
          return  binarySearch(height,mid+1,end,k);
        else
            return binarySearch(height,start,mid-1,k);

    }

    private static int cutter(int[] tree , int height ){
        int ans = 0;
        for(int x : tree){
            if(x>height){
                ans += x - height;
            }
        }
        return ans;
    }
}