package Function;
import java.util.*;
public class math {
    public static int multi(int a){
        a=a*a;
        return a;
    }
    public static float multi(float a, float b, float c){
        System.out.println("call of flot");
        return a;
    }
    public static void main(String[] args) {
        System.out.println(multi(23));

    }
}
