public class sorted_rotated {
    public static void check(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                count++;
            }
        }
        if(count==1){
            System.out.println("array is sorted and rotated");
        }
        else{
            System.out.println("array is not sorted and rotated");
        }
    }
    public static void main(String[] args) {
        int[] arr={45,54,-1,12,33};
        check(arr);           
    }
}
