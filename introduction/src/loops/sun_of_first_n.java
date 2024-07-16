package loops;

import java.util.Scanner;

public class sun_of_first_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum,i;
        sum=0;
        System.out.print("Enter n: ");
        n=sc.nextInt();
        while(n>0){
            sum=sum+n;
            n--;
        }
        System.out.println(sum);
    }
}
