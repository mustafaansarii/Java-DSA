public class clear_bit {
    public static void main(String[] args) {
        int i=1;
        int bitmask=~(1<<i);
        System.out.println(10 & bitmask);
    }
}
