public class union_intersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,6,3,7,8};
        int arr3[]=new int[arr1.length+arr2.length];
        int arr4[]=new int[arr1.length+arr2.length];
        int index=0;
        for(int i=0;i<arr1.length;i++){
            arr3[index++]=arr1[i];
            arr3[index++]=arr2[i];
        }
        System.out.println("Union of two arrays are:");
        for(int i=0;i<arr3.length;i++){
            System.out.print(" "+arr3[i]);
        }
        System.out.println("");
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
            arr4[ind++]=arr1[i];
            arr4[ind++]=arr2[i];
            }
        }
        int count=0;
        for(int i=0;i<arr4.length;i++){
            if(arr4[i]!=0){
                count++;
            }
        }
        System.out.println("Intersection of two arrays are:");
        for(int i=0;i<count;i++){
            System.out.print(" "+arr4[i]);
        }
    }
}
