package helloaworld;

import java.util.Scanner;

public class conditional {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the no= ");
		
		int n=scanner.nextInt();
		System.out.print("Enter the no2= ");
		int n2=scanner.nextInt();
		
		if (n > n2)
			System.out.println("n is greatter");
		else if (n==n2)
			System.out.println("n is quall to n2");
		else {
			System.out.println("n2 is gratter");
			
		
		}
		scanner.nextLine();
		System.out.print("enter name= ");
		String name=scanner.nextLine();
		System.out.println(name);
			
		
	}

}
