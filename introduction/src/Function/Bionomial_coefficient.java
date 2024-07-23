package Function;

public class Bionomial_coefficient {
    public static int bionomial(int n){
        int f=1;
        for (int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n=bionomial(5);
        int r=bionomial(2);
        int n_r=bionomial(5-2);
        int bio=r*n_r;
        System.out.println(n/bio);

    }


    }

