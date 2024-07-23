package advance_pattern;

public class folyd_tri {
    public static void f_l(int n){
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        f_l(5);
    }
}
