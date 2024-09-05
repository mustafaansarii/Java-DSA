import java.util.ArrayList;

public class size_all {
    public void sizeAll(){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(33);
        list.add(43);
        System.out.println(list);
        System.out.println("size:"+ list.size());
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        size_all size=new size_all();
        size.sizeAll();


    }
}
