package Function;

public class factorial {
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n* fact(n-1);
    }
    public static int factorial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;

        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(factorial(1));
    }
}
