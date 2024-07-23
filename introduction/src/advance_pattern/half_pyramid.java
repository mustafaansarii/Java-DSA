package advance_pattern;

public class half_pyramid {
    public static void pyramid(int n){
        while (n!=0){
            for (int j=1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
            n--;
        }

    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
