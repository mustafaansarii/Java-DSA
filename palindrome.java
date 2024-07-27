public class palindrome {
    public static void main(String[] args) {
        String name="121";
        for (int i=0; i<name.length()/2;i++){
            if (name.charAt(i)==name.charAt(name.length()-i-1)){
                System.out.println(true);
                break;
            }else {
                System.out.println(false);
                break;
            }

        }

    }
}
