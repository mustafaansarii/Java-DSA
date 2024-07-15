package condition;

import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        System.out.println("This is a Income tax calculator");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Income: ");
        float myincome=sc.nextFloat();
        float tax;

        if (myincome<500000) {
            tax=0;
        } else if (myincome>= 500000 && myincome <1000000) {
            tax=myincome*0.2f;
        } else {
            tax=myincome*0.3f;
        }
        System.out.println("The calculated tax is: "+tax);



    }
}
