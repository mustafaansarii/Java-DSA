public class largest_string {
    public static void main(String[] args) {
        String a[]= {"Mango","banana","banane"};
        String larg=a[0];
        for (int i=0; i<a.length; i++){
             if (larg.compareTo(a[i])<0){
                 larg=a[i];
             }
        }
        System.out.println(larg);
    }
}
