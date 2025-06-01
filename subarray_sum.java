public class subarray_sum {
    public static void sum(int[] arr,int target){
        int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            int Sum=0;
            Sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                Sum += arr[j];
                if(Sum==target){
                   start=i;end=j;
                }
            }
        }
        System.out.println("Subarray with sum "+target+ " is :");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,5,6,8,10};
        int target=21;
        sum(arr, target);
    }
}
