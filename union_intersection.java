import java.util.HashSet;
import java.util.TreeSet;

public class union_intersection {
    public static void Union(int[] arr1,int[] arr2){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
            for(int j=0;j<arr2.length;j++){
                set.add(arr2[i]);
            }
        }
        System.out.println("Union : "+set);
    }
    public static void Intersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                   set.add(arr1[i]);
                }
            }
        }
        System.out.println("Intersection : "+set);         
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,6,3,7,8};
        Union(arr1, arr2);
        Intersection(arr1, arr2);
    }
}