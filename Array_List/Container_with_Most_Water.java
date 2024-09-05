import java.util.ArrayList;
import java.util.Arrays;

public class Container_with_Most_Water {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,8,6,2,5,4,8,3,7));
//        Most_water(list);
        
        int max_water=0;
        for (int i=0; i<list.size();i++){
            for (int j=i+1; j<list.size();j++){
               int width=j-i;
               int height=Math.min(list.get(i),list.get(j));
               max_water=Math.max(width*height,max_water);
            }
        }
        System.out.println("Max_water: "+ max_water);
    }
    public static void Most_water(ArrayList<Integer> list){
        int left_max=list.get(0);

        for(int i=1; i<list.size(); i++){
            left_max=Math.max(left_max,list.get(i));
        }
        System.out.println(left_max);
        int right_max=list.get(list.size()-1);
        for(int i=list.size()-2; i<1; i--){
            right_max=Math.max(right_max,list.get(i));
        }
        System.out.println(right_max);

    }
}
