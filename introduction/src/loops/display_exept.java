package loops;

import java.util.Scanner;

public class display_exept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=10;
        do {
            System.out.print("Enter: ");
            int n=sc.nextInt();
            if (n==10){
                continue;
            }
            k--;

        }while (k!=0);
    }
}
