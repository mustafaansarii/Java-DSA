package Function;

import javax.swing.*;

public class prime2 {
    public static boolean prime(int n){
        for (int i=2; i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(5));
    }
}
