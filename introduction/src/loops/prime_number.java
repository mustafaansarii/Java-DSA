package loops;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int m=3;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.print("Enter no: ");
            int n= sc.nextInt();
            if (n%m!=0 || n==2){
                System.out.println("This is a not prime number");

            }else {
                System.out.println("This a prime number");
            }
            while (m<n-1){
                m++;
            }
        }while (true);

    }
}
