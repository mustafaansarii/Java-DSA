package Function;

import java.util.Scanner;

public class calculator {
    public static  float sum1(float a,float b){
        System.out.print("this is sum: ");
        float c=a+b;
        return c;
    }
    public static float multiplie(float a, float b){
        System.out.print("Multiplication: ");
        return a*b;
    }
    public static float substract(float a, float b){
        System.out.print("substraction: ");
        return a-b;
    }
    public static float devide(float a, float b){
        System.out.print("devision: ");
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float a= sc.nextFloat();
        System.out.print("Enter 1st number: ");
        float b= sc.nextFloat();
        System.out.println(sum1(a,b));;
        System.out.println(multiplie(a,b));
        System.out.println(devide(a,b));
        System.out.println(substract(a,b));

    }
}
