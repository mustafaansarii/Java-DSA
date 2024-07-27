public class get_ith_bit {
    public static void main(String[] args) {
        int n=5;
        int i=1  ;
        int bitmask=1<<i;
        if ((5 & bitmask)==0){
            System.out.println(0);
        }else {
            System.out.println(1);
        }


    }
}
