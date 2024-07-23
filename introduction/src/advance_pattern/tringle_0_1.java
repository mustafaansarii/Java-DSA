package advance_pattern;

public class tringle_0_1 {
    public static void tringle(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tringle(5);
    }
}
