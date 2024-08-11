public class inheritence{
    public static void main(String[] args) {
        derived derived=new derived();
        
        derived.setx(34);
        int a=derived.getx();
        System.out.println(a);

        derived.sety(45);
        System.out.println(derived.gety());
    }
}

class Base{
    int x;

    Base(){
        System.out.println("This is constructor of Base");
    }

    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x=x;
    }
}


class derived extends Base{
    int y;
    public int gety(){
        return y;
    }

    public void sety(int y){
        this.y=y;
    }

}


