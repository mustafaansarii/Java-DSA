package helloaworld;

import java.util.Arrays;
import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		//Concatenate String
		
		String name1= "Aman";
		String name2= "shiv";
		String name3= name1 +" And "+ name2;
		System.out.println(name3);
		
		System.out.println(name1.charAt(1));
		System.out.println(name1.length());
		
		String st= name1.replace("A","S");
		System.out.println(st);
		
		//substring
		String name4= "Aman and akku";
		System.out.println(name4.substring(5,8));
		
		//Arays
		
		int age=30;
		int physics=89;
		int math= 90;
		int science= 90;
		
		int[] marks = new int[3];
		marks [0]= 97;
		marks [1]= 90;
		marks [2]= 57;
		System.out.println(marks[0]);
		//length
		System.out.println(marks.length);
		// sort
		
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		int [] mark= {97,89,65,54};
		
		int [][] finalmarks= {{98,67,42,34},{23,43,65,56}};
		System.out.println("final marks= " + finalmarks[1][0]);
		
		//casting
		// to change data type
		
		double price=100.00;
		double finalprice= price + 18;
		System.out.println(finalprice);
		
		int p =100;
		int fp= p + (int)18.18;
		System.out.println(fp);
		
		//constants
		
		int age2 = 30;
		age2 = 31;
		age2 = 32;
		
		final float PI=3.12F;
		
		//operator
		
		double a = 1;
		double b= 2;
		System.out.println(a+b);
		
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		//asignment operator
		
		int nimb=1;
		
		nimb++;
		System.out.println(nimb);
		System.out.println(++nimb);
		System.out.println(--nimb);
		
		//maths
		
		System.out.println(Math.max(5,6));
		System.out.println("min= " + Math.min(5,6));
		System.out.println("random= "+ Math.random());
		System.out.println("random= "+ (int)(Math.random()*100));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input= ");
		int age4= sc.nextInt();
		
		System.out.println(age4);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter your name= ");
		String name6= sc1.nextLine();
		System.out.println(name6);
		 
		
		
		
		// comperison operator
		
		// !=
		// ==
		// >
		//<
		// <=
		// >=
		
		// conditional statement
		
		boolean isSunp = true ;
		if (isSunp== true)
			System.out.println("day");
		else
			System.out.println("night");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
