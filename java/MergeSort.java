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
        int j=
    }

}