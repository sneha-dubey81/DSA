public class kadane_algo {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,5,-1,4};
        int max1=0;
        int index1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
                index1=i;
            }
        }
        int max2=0;
        int index2=0;
        for(int j=0;j<arr.length;j++){ 
            if(arr[j]<=max1&&arr[j]>max2){
                if( j!=index1){
                max2=arr[j];
                index2=j;
                }    
            }
            
        }
        int max3=0;
        int index3=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]<=max1&&arr[k]<=max2&&arr[k]>max3){
                if( k!=index1&&k!=index2){
                max3=arr[k];
                index3=k;
                }
            }
            
        }
 
        // System.out.println("max1: "+max1);
        // System.out.println("index1: "+index1);
        // System.out.println("max2: "+max2);
        // System.out.println("index2: "+index2);
        // System.out.println("max3: "+max3);
        // System.out.println("index3: "+index3);

        int sum=max1 + max2+ max3;
        System.out.println("max sum = "+sum);
    }
    }
