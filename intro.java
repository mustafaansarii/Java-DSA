import java.util.Scanner;

public class intro {
    public static void print(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        System.out.println(name);
        String name="mustafa";
//        String lname="ansari";
//        System.out.println(name+" " +lname);
//        System.out.println(name.charAt(0));
        print(name);
    }
}
