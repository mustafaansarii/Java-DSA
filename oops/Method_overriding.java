public class Method_overriding {
    public static void main(String[] args) {
        b b=new b();
        b.method3();
        System.out.println(b.add2());
        
    }
    
}

class A{
    public int add(){
        return 4;
    }

    public String add2(){
        return "5";
    }
}

class b extends A{
    public void method3(){
        System.out.println("method 3");
    }
    @Override
    public String add2(){
        return "hi";
    }
    
}
