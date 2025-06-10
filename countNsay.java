public class countNsay {
    public static void count(int n,String str){
        for(int i=1;i<n;i++){
        int count =1;
        StringBuilder curr= new StringBuilder();
        for(int j=1;j<str.length();j++) {
            if(str.charAt(j)==str.charAt(j-1)) {
                count++;
            }
            else{
                curr.append(count).append(str.charAt(j-1));
                count=1;
            }
        }
        curr.append(count).append(str.charAt(str.length()-1));
        System.out.println(curr); 
        str=curr.toString();
        }
    }
    public static void main(String[] args) {
        String str="123";
        System.out.println(str);
        count(3,str);
    }
}
