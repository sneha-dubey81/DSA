public class str_reverse {
    public static void reverse(String str){
        StringBuilder str1=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--) {
            str1.append(str.charAt(i));
        }
        System.out.println(str1);
    }
    public static void main(String[] args) {
        String str="sneha";
        reverse(str);
    }
}
