public class sorted_rotated {
    public static void main(String[] args) {
        int[] arr={54,1,12,33,45};
        int max=0;int sort=0;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sort=1;
            }
        }
        if(arr[0]==max&&sort==1)
        System.out.println("array is rotated and sorted"); 
           
    }
}
