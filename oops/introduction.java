//public class introduction {
//    public static void main(String[] args) {
////        name  n1= new name(1,2);
////        n1.employ(23, "mustafa");
////        Employ1 em1=new Employ1(23000,"ram");
////        System.out.println(em1.setname());
////        cellphone c1=new cellphone();
////        c1.total_keywords=34;
////        c1.rington="tinnnnntinnnnnn";
////        c1.vibrating="hmmmmmmmmmmmmmmm";
////        System.out.println(c1.vibrating);
////        System.out.println(c1.rington);
////        System.out.println(c1.total_keywords);
//    }
//}
class name{

    int np;
    int id; 
    name(int np,int id){
        this.np=np;
        this.id=id;
        System.out.println(np);
    }
    void employ(int no, String name) {
        System.out.println("this is my name " + this.np + " id " + this.id);
        ;
        this.np = 45;
        System.out.println(this.np);

    }
}
class Employ1{
    int salary;
    String name;
    Employ1(int slary,String name){
        this.name=name;
        this.salary=salary;
    }
    public int getSlary(){
        return this.salary;
    }
    public String getname(){
        return this.name;
    }
    public String setname(){
        this.name="mustafa";
        return  this.name;
    }


}

class  cellphone{
    String vibrating;
    int total_keywords;
    String rington;

    String vibrator(){
       

        return vibrating;
    }
    int getTotal_keywords(){
        return total_keywords;
    }
    String getRington(){
        return rington;
    }
}

class Area{
    int length;
    int width;
    int radius;
    Area(int length, int width, int radius){
        this.length=length;
        this.width=length;
        this.radius=radius;
    }
    public int getaAreaof_rectangle(){
        return this.length*this.width;
    }
}

public class introduction{
    public static void main(String[] args) {
        Area A1=new Area(12,21,43);
        int total_a=A1.getaAreaof_rectangle();
        System.out.println(total_a);
    }
}