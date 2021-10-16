
import java.util.Arrays;

public class qucicsort {
    public static void main(String[] args) {
        int arr[]={1,2,6,4,3,0};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int start, int end) {
        if(start>end){return;}
            int pi=partiton(arr,start,end);
            quicksort(arr,start,pi-1);
            quicksort(arr,pi+1  ,end);

    }
       /*
       5 4 3 2 1
        */
    private static int partiton(int[] arr, int start, int end) {
        int povi=arr[end]; //5
        int j=start-1;   //4
        for(int i=start;i<=end-1;i++){
            if(arr[i]<povi){
                j++;
                swap(arr,j,i);

            }
        }
        swap(arr,j,end);
        return j+1;
    }
    private  static  void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}