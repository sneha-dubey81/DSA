public class occurences {
    public static void main(String[] args) {
        int []arr={1,2,2,3,4,4,4,5,5,6};
        for(int i=0;i<arr.length;i++){
        int count=1;
        boolean counted =false;
            for(int k=0;k<i;k++){
                if(arr[i]==arr[k])
                counted=true;
            }
            if(counted){
                continue;
            }
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }            
            System.out.println(arr[i]+" = "+count);
        }
    }
}
