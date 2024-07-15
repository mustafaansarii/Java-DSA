import java.util.Scanner;

public class poblems1 {
    public static void main(String[] args) {
        /*Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N) */

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A: ");
        float A=sc.nextFloat();
        System.out.print("Enter B: ");
        float B=sc.nextFloat();
        System.out.print("Enter C: ");
        float C=sc.nextFloat();
        float Avarage=(A+B+C)/3;
        System.out.print("Avarge= ");
        System.out.println(Avarage);
/*

Question 2: In a program, input the side of a square. You have to output the area of the
square.(Hint : area of a square is (side x side)) */

        int side=sc.nextInt();
        System.out.println(side*side);
/*

Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

        System.out.print("Enter Book: ");
        float Book=sc.nextFloat();
        System.out.print("Enter pencile: ");
        float pencile=sc.nextFloat();
        System.out.print("Enter pen: ");
        float pen=sc.nextFloat();
        float total1=A+B+C;
        float total=(total1/100)*18;
        System.out.print("total= ");
        System.out.println(total+total1);
        System.out.println(total);
        System.out.println(total);
    }
}


