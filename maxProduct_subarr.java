public class maxProduct_subarr {
    public static void product(int[] arr){
        int max=0,start=0,end=0;
        for(int i=0;i<arr.length;i++){
            int mul=1;
            mul *= arr[i];
            for(int j=i+1;j<arr.length;j++){
                mul *=arr[j];
                if(mul>max){
                    max=mul;
                    start=i;end=j;
                }
            }
        }
        System.out.println("Maximum product = "+max);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,0,7,2,2,0,2,10};
        product(arr);
    }
}
