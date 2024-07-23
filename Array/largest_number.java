public class largest_number {
    public static int num(int n[]){
        int max=Integer.MIN_VALUE;
        for (int i=0; i< n.length; i++){
            if (n[i]>max){
                max=n[i];
            }
        }return max;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,2,12,32,43};
        System.out.println(num(num));

    }
}
