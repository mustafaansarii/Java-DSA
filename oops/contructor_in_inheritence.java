public class contructor_in_inheritence {
    public static void main(String[] args) {
        derived derived =new derived(34);

        // base base=new base(23);

        
    }
    
}


class base{
    base(){
        System.out.println("This is a constructor");
    }
    base(int a){
        System.out.println(a);

    }
    public int x;
    
    public int  getx(){
        return x;
    }

    public void setx(int x){
        this.x=x;
    }

}


class derived extends base{
    derived(int x){
        super (x);
    }

}