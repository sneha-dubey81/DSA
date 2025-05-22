public class sort_012 {
    public static void main(String[] args) {
        int[] arr={1,0,1,2,0,1,2,2,0,1};
        int[] arr1=new int[arr.length];
        int index=0;;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr1[index++]=arr[i];            
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                arr1[index++]=arr[i];    
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                arr1[index++]=arr[i];    
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
