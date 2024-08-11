
public class constructor {
    public static void main(String[] args) {
        cnsdt c1= new cnsdt(1, 10,23);
        cnsdt c2=new cnsdt("mustafa");
    }
}

class cnsdt{
    int a;
    int b;
    cnsdt(int a, int b){
        this.a=a;
        this.b=b;
    }
    cnsdt(String name){
        System.out.println(name);
    }
    cnsdt(int d, int c, int r){
        System.out.println(a+b+c);
    }

    
}

