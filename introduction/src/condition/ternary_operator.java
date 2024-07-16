package condition;

public class ternary_operator {
    public static void main(String[] args) {
        int a=56;
        String type=(a%2==0)? "Even":"odd";
        System.out.println(type);

        int marks=34;
        String result=(marks>=33)? "PASS":"Fail";
        System.out.println(result);

    }
}
