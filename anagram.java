public class anagram {
    public static void check(String str1,String str2){
        int count=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        int n=str1.length();  int m=str2.length();
        if(count==n && n==m){
            System.out.println("strings are anagrams");
        }
        else{
            System.out.println("strings are not anagrams");
        }
    }
    public static void main(String[] args) {
        String str1="throws";
        String str2="worth";
        check(str1, str2);
    }
}
