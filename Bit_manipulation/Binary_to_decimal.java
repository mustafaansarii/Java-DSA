public class Binary_to_decimal {
    public static void  btod(int n){
        int d=0;
        int i=0;
        while (n!=0){
            d+=(n%10)*((int)Math.pow(2,i));
            i++;
            n/=10;
        }
        System.out.println(d);
    }

    public static void main(String[] args) {
        btod(1111);
    }
    
}
