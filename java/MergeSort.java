import java.util.Arrays;
class MergeSort{
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergesort(int arr[],int start,int end){
        if(start>=end) return ;
        int mid=start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    private static void merge(int arr[],int start ,int mid ,int end){
        int i=start;
        int j=mid+1;
        int idx=0;
        int total[]=new int [end-start+1];
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                total[idx++]=arr[i++];
            }else{
                total[idx++]=arr[j++];
            }
        }
        while (i<=mid){
            total[idx++]=arr[i++];
        }
        while(j<=end){
            total[idx++]=arr[j++];
        }
        idx=0;
        for(int z=start;z<=end;z++){
            arr[z]=total[idx++];
        }
    }

}