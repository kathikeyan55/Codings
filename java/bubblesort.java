
// import java.util.ArrayList;
import java.util.Arrays;
public class bubblesort{
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    private static  void sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
    }
    private  static  void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        fsfdsfdffsssssfdsfdfssfdsf
    }
     
}

