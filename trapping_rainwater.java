import java.util.ArrayList;
public class trapping_rainwater {
    public static void func(int[]arr){
        ArrayList<Integer> Rmax=new ArrayList<>();
        ArrayList<Integer> Lmax=new ArrayList<>();
        int RmaxHeight=0;
        int LmaxHeight=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>LmaxHeight){
                LmaxHeight=arr[i];
                Lmax.add(LmaxHeight);
            }
            else{
                Lmax.add(LmaxHeight);  
            }         
        }
            for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>RmaxHeight){
                RmaxHeight=arr[i];
                Rmax.add(RmaxHeight);
            }
            else{
                Rmax.add(RmaxHeight);  
            }         
        }
        int j=0,k=0,unit1=0,unit2=0;
        for(int i=0;i<arr.length;i++){
            j=Lmax.get(i);
            if(j<max){
            unit1+=Lmax.get(i)-arr[i];
            }
        }
        System.out.println("");
        for(int i=arr.length-1;i>=0;i--){
            k=Rmax.reversed().get(i);
            if(k<max){
                unit2+=Rmax.reversed().get(i)-arr[i];
            }
        }
        // System.out.println(unit1);
        // System.out.println(unit2);
        int unit=unit1+unit2;
        System.out.println("Amount water that can be trapped is :"+unit+" units");
    }
    public static void main(String[] args) {
        int[] arr={3,0,2,6,0,1,4};
        func(arr);
    }
}
