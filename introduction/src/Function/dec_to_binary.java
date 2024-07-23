package Function;

import com.sun.source.tree.BreakTree;

public class dec_to_binary {
    public static int decimal_to_binary(int n){
        int bin=0;
        int pow=0;
        while (n!=0) {
            bin = (bin + (n%2)) * ((int) Math.pow(10, pow));
            n = n / 2;
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        System.out.println(decimal_to_binary(4));
    }
}
