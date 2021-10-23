
import java.util.Arrays;

public class qucicsort {
    public static void main(String[] args) {
        int arr[]={1,2,6,4,3,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[], int low, int high)
    {
        if(low >high) return ;
        int p=partition(arr, low, high);
         quickSort(arr,low ,p-1);
         quickSort(arr,p+1,high);
        
    }
    static int partition(int arr[], int low, int high)
    {
       int pivot=arr[high];
       int j=low;
       for(int i=low;i<=high-1;i++){
           if(arr[i]<pivot){
             
               swap(arr,i,j);
                 j++;
           }
       }
       swap(arr,j,high);
       return j;
       
    } 
    private static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}