import java.util.ArrayList;
public class leader {
    public static void Leaders(int[] arr){
        ArrayList<Integer> arr1= new ArrayList<>();
        arr1.add(arr[arr.length-1]);
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]<=arr[i-1]){
                max=arr[i-1];
                arr1.add(max);
            }
        }
        System.out.println(arr1); 
    }
    public static void main(String[] args) {
        int[] arr={17,16,17,4,6,3,5,8,2};
        Leaders(arr);
    }
}
