public class sub_string {
    public static void main(String[] args) {
        String str="helloWorld";
        String subs="";
        int si=0;
        int ei=5
                ;
        for (int i=si; i<ei; i++){
            subs+=str.charAt(i);
        }
        System.out.println(subs);
        System.out.println(str.substring(0,5));
    }
}
