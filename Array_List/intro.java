import java.util.ArrayList;

public class intro {
    public static void main(String[] args) {
//        intro obj = new intro();
//        ArrayList<?> list = obj.list();
//        System.out.println(list);
//        System.out.print(list.get(0));
//        list.remove(0);
//        System.out.print(list);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(33);
        list.add(43);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.contains(23));
        list.add(1,99);
        System.out.println(list);
    }

    public ArrayList<?> list() {
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);

        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<Boolean> list4 = new ArrayList<>();
        return list2;
    }
}
