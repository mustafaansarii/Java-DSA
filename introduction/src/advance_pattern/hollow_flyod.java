package advance_pattern;

public class hollow_flyod {
    public static void floyod(int n) {
       for (int i=1; i<=n; i++){
             for (int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyod(5);
    }
}
