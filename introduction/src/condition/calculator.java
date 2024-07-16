package condition;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();
        System.out.print("b= ");
        int b=sc.nextInt();
        char oprator=sc.next().charAt(0);
        switch (oprator){
            case '+':
                System.out.println(a+b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
            case '-':
                System.out.println(a-b);
            default:
                System.out.println("sasta calculator hai!");
        }
    }
}
