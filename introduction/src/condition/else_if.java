package condition;

public class else_if {
    public static void main(String[] args) {
        int a = 23;
        int b = 45;
        int c = 323;

        if (a > b && a > c) {
            System.out.println(a + " is greater");
        } else if (b > c && b > a) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
    }
}