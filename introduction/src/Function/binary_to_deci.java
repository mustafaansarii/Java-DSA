package Function;

public class binary_to_deci {
    public static int binarytodicimal(int n){
        int decimal=0;
        int pow=0;
        while (n!=0){
            int lastdigit= n%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(binarytodicimal(101));
    }
}
