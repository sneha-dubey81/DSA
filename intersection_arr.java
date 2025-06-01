import java.util.HashSet;
public class intersection_arr {
    public static void func(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   set.add(arr1[i]);
                }
            }
        }
        System.out.println("Intersection of two arrays are:"+set);
    }
    public static void main(String[] args) {
        int arr1[]={1,1,2,2,4};
        int arr2[]={2,2,4,4};
        func(arr1,arr2);
    }
}
