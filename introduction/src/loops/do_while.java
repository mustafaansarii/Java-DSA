package loops;

public class do_while {
    public static void main(String[] args) {
        int i=10;
        do {
            System.out.println(i);
            if (i==3){
                break;
            }
            i--;
        }while (i>=0 );
    }
}
