public class Decimal_to_binary {
    public static void dtoc(int num) {
        int binary = 0;
        int i = 1;
        while (num != 0) {
            binary += (num % 2) * i;
            num /= 2;
            i *= 10;
        }
        System.out.println(binary);
    }

    public static void main(String[] args) {
        int num = 5;
        dtoc(num);
    }
}
