
import java.util.*;
//import java.util.Map;

public class Hasmap {
    public static void main(String[] args) {
//       System.out.println(getMax(new int[]{2,1,5,1,3,2} , 3));
        int arr[] = {4,2,2,7,5,1,2,7,1,0};
        int k =8;
        System.out.println(samallsub(arr,k));
        String name= "karthikeyan";
// System.out.println(name.indexOf("k"));
        System.out.println(name.substring( 5));
    }


    private  static  int getMax(int arr[], int k){
        int maxSum =0 ;
        int sum =0;
        for(int i =0 ;i<k;i++){
            sum += arr[i];
        }
        for(int windx = k ; windx < arr.length;windx++){
            sum +=arr[windx] - arr[windx-k];
            maxSum = Math.max(sum, maxSum);
        }
        return  maxSum;
    }
    private static  int samallsub(int arr[],int target){
        int windowStart=0;
        int curr =0;
        int size =Integer.MAX_VALUE;
        for(int windowEnt=0;windowEnt<arr.length;windowEnt++){
           curr += arr[windowEnt] ;
           while (curr >= target){
               size = Math.min(size , windowEnt - windowStart+1);
               curr -=arr[windowStart];
               windowStart++;
            }
        }
        return  size;
    }


}