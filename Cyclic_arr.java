public class Cyclic_arr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1]; 
        }
        arr[0]=arr.length;
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]); 
        }
        
    }
}