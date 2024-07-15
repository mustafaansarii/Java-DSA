package condition;

public class largest_no {
    public static void main(String[] args) {
        int a,b,c;
        a=23;
        b=43;
        c=29;
        if (a>b && a>c){
            System.out.println("A is bigger");
        } else if(b>a && b>c){
            System.out.println("B is bigger");
        } else {
            System.out.println("C is bigger");
        }

    }
}
