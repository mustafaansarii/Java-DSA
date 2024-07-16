package loops;

import java.util.Scanner;

public class break_continue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=0;
        do {
            int n=sc.nextInt();
            if (n==5){
                continue;
            }
            System.out.println(n);
            k++;

        }while (k!=10);
    }
}
