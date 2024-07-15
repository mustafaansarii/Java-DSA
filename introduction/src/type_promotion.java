public class type_promotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println(b-a);

        short c=5;
        byte f='c';
        System.out.println(a+b+f);

        byte bi=5;
        int fg=bi*2;
        System.out.println(fg);
    }
}
