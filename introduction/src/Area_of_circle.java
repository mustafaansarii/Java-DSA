import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter pie: ");
        float pie= sc.nextFloat();
        System.out.println("Enter r: ");
        float r=sc.nextFloat();
        float area=pie*(r*r);
        System.out.println(area);
    }
}
