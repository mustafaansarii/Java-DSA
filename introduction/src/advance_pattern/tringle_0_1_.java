package advance_pattern;

public class tringle_0_1_ {
    public static void trin_0_1 (int n){
        int a=0;
        int b=1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }else{
                System.out.print("0");
            }}
            System.out.println();
        }
    }

    public static void main(String[] args) {
        trin_0_1(5);
    }
}
