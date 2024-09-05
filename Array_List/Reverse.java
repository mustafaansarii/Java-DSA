import java.util.ArrayList;
import java.util.Map;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }

        int max=-Integer.MAX_VALUE;
        for (int i=list.size()-1; i>=0; i--){
//            if (max<list.get(i)){
//                max=list.get(i);
//            }
            max= Math.max(max,list.get(i));

        }
        System.out.println();
        System.out.println(max);

    }
}
