public class arr_order{
    public static void main(String[] args) {
        int []arr={-4,0,5,5,0,0,-5};
        int [] newArr= new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                newArr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                newArr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                newArr[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}