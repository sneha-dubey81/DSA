public class sum_pairs {
    public static void sum(int[]arr){
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==target){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }   
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,4,6,5,7};
        sum(arr);
    }
}
