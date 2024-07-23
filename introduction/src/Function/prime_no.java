package Function;

public class prime_no {
    public static boolean prime(int n){
        if (n==2 || n==3){
            return true;
        }
        for (int i=2; i<=n; i++){
            if (n%i==0){
                return false;
            }else {
                return true;
            }

        }return true;

    }

    public static void main(String[] args) {
        System.out.println(prime(50));
    }
}
