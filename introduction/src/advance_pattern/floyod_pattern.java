package advance_pattern;

public class floyod_pattern {
    public static void floyod(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyod(5);
    }
}
