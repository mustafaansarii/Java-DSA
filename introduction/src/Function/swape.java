package Function;

public class swape {
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args) {
        int a=4;
        int b=14;

        swap(a,b);
    }
}
