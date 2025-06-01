public class maxSum_subarr {
    public static void sum(int[] arr){
        int max=0;int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                    start=i;end=j;
                }
            }
        }
        System.out.println("Maximum sum = "+max);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        sum(arr);
    }
}
