public class uppercase {
    public static void upper(String str) {
        System.out.println(str.toUpperCase());
        System.out.println(str);
    }
    public static void toupper(String str) {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
    }
    public static void main(String[] args) {
        String str="Mustafa Ansari";
        toupper(str);
    }
}
