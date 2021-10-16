/**
 * kadane
 */
import java.util.*;
public class kadane {
    private static int maxSubArray(int[] array, int n){
        int max_sum=Integer.MIN_VALUE;
        int max_so_for=0;
        for(int i=0; i<array.length; i++){
            max_so_for+=array[i];
            if(max_sum<max_so_for){
                max_sum=max_so_for;
            }
            if(max_so_for<0){
                max_so_for=0;
            }
        }
        return  max_sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=scanner.nextInt();
        }
        int max_sum=maxSubArray(arr,N);
        System.out.println(max_sum);
    }
}