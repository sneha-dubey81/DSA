public class palindrome {
    public static void func(String str){
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str;
        }
        if(str.equals(str1)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str="abcba";
        func(str);
    }
}
