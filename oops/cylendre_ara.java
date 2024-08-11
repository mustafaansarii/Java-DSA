public class cylendre_ara {
    public static void main(String[] args) {
        area A1=new area();
        A1.setint(12,2);
        float area=A1.getArea();
        System.out.println(area);
    }
    
}
class area{
    private float pie=(int)3.14;
    private int r;
    private int h;

    void setint(int radius,int height){
        r=radius;
        h=height;
    }

    public float  getArea(){
        float area=(float)pie*h*(float)Math.pow(r, 2);
       return area;
    }
}