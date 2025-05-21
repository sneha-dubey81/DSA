public class kth_max_min {
    public static void main(String[] args) {
        int arr[]={1,2,7,12,8,5};
        int k=3;
         for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++)
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
    System.out.println("kth max element is:"+arr[arr.length-k]);
    System.out.println("kth min element is:"+arr[k-1]);
    }
}
