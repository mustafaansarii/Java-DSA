class Hello {
    void sayHello() {
        System.out.println("This is the Hello class.");
    }
    void sayHello2() {
        System.out.println("This is the Hello class.");
    }
}


public class intro {
    public static void main(String[] args) {
        System.out.println("This is the intro class.");
        Hello hello = new Hello();
        hello.sayHello();
        hello.sayHello2();
    }
}

