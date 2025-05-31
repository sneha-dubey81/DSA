public class missing_num {
    public static void find(int[] arr){
        int n=arr[arr.length-1];
        int sum=n*(n+1)/2; 
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
        }
        int Mnum=sum-currSum;
        System.out.println(Mnum);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6,7};
        find(arr);
    }
}
