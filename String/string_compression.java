public class string_compression {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder();
        String str="aaabbbccdd";
        String newstr="";
        for(int i=0; i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            str1.append(str.charAt(i));
            if(count>1){
                str1.append(count.toString());
            }
        }
        System.out.println(str1);

    }
    
}
