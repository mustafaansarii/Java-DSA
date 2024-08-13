public class this_and_super {
    public static void main(String[] args) {
        // base base =new base(23);
        // base.call();
        // derived2 der2=new derived2(10);
        Child child=new Child();
        child.display3();

        
    }
    
}

class base{

    int a;
    public base(int a) {
        this.a=a;
    }

    public int squere(){
        return this.a*this.a;
    }
4
    public void call(){
        System.out.println(squere());
    }
    
}

class derived1 extends base{
    derived1(int x){
        super(x);
        System.out.println("this is derived1 class"+x);

    }
}

class derived2 extends derived1{
    derived2(int x){
        super(34);
        System.out.println("this is derived2 class"+x);

    }
}

class Parent { 
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int  display2() {
        super.display();  // Calls the parent class method
        return 1;
    }
    void display3(){
        System.out.println(this.display2());
    }

    
}


class myname{
    int n;
    void name(){
        System.out.println("Mustafa");
    }
}


class number extends myname{
    void name(){
        super.n=34;
    }

}