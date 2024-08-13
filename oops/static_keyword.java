public class static_keyword {
    public static void main(String[] args) {
        // school s=new school();
        // s.schoolname="smn";
        // System.out.println(s.schoolname);
        // school s1=new school();
        // s1.schoolname="maneshwar";
        // System.out.println(s1.schoolname);
        // System.out.println(s.schoolname);
        int result = MathUtils.add(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8
    }
    
}

class school{
    String name;
    int roll;
    static String schoolname;
}

class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}
