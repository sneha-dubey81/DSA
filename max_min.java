public class max_min {
    public static void main(String[] args) {
        int arr[]={5,2,7,12,8};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("maximum element of array is:" +max);
        System.out.println("minimum element of array is:" +min);
    }
}
