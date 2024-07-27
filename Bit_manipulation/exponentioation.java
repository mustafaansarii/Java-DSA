public class exponentioation {
    public static void main(String[] args) {
        int a=3;
        int n=99;
        int answer=1;
        while (n>0){
            if ((n&1)!=0){
                answer *=a;
            }
            a*=a;
            n>>=1;
        }
        System.out.println(answer);
    }
}
