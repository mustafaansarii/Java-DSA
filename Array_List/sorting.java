import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sorting {
    public static void sort(ArrayList<Integer> list){
        Collections.sort(list);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(112);
        list.add(13);
        list.add(14);
        sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        int []array={12,34,11,3,3,56,};
        Arrays.stream(array).sorted();
    }
}
