import java.util.ArrayList;
public class neg_pos_alternate {
    public static void main(String[] args) {
        int[] arr={1,2,-1,3,-2,-3,4,-4,-5,5};
        int[] arr1=new int[arr.length/2];
        int[] arr2=new int[arr.length/2];
        int[] arr3=new int[arr.length];
        int indN=0 , indP=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr1[indN++]=arr[i];
            }
            if(arr[i]>0){
                arr2[indP++]=arr[i];
            }
        }
        int j=0,k=0;
        for(int i=0;i<arr.length;i+=2){
            arr3[i]=arr1[j++];
        }
        for(int i=1;i<arr.length;i+=2){
            arr3[i]=arr2[k++];
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr3[i]);  
        }
    }     
}
