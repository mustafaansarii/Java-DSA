package Pattern;

public class INVERTED_HALF_PYRAMID {
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
