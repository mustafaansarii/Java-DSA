public class abstract_class{
    public static void main(String[] args) {
        Horse h=new  Horse();
        h.eat();
        h.walk();
        chicken ch=new chicken();
        ch.eat();
        ch.walk();
        System.out.println(ch.color);
    }
}


abstract class animal{
    String color;
    animal(){
        color="brown";

    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();

}

class Horse extends animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}

class chicken extends animal{
    chicken(){
        System.out.println("Chicken constructor");
    }
    void changecolor(){
        color="black";
    }
    void walk(){
        System.out.println("walk on two legs");
    }
}