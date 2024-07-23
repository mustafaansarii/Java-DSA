package Function;

import java.util.Scanner;

public class sum_of_two {
    public static int sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=sc.nextInt();
        System.out.print("Enter b: ");
        int b= sc.nextInt();
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
