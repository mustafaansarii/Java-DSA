import java.util.ArrayList;

public class Two_D_Array {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list);
        for (int i=0; i<list.size();i++){
            for (int j=0; j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+ " ");
            }
        }


    }

    public static void mainList(){
        ArrayList<ArrayList<Integer>> newlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for (int i=0; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        newlist.add(list1);
        newlist.add(list2);
        newlist.add(list3);
        System.out.println(newlist);

    }
}
