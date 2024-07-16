package loops;

import java.util.Scanner;

public class ont_to_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        int counter=0;
        while (counter<=a){
            System.out.println(counter);
            counter++;
        }

    }
}
