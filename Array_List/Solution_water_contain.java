import java.util.ArrayList;
import java.util.Arrays;
public class Solution_water_contain {
    public int maxArea(ArrayList<Integer> height) {
        int MaxWater=0;
        int left=0;
        int right=height.size()-1;
        while (left<right) {
            int ht=Math.min(height.get(left), height.get(right));
            int width=right-left;
            int currwater=ht*width;
            MaxWater=Math.max(MaxWater, currwater);
            if (height.get(left)<height.get(right)) {
                left++;

            }else{
                right--;
            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height =new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        int a=new Solution_water_contain().maxArea(height);
        System.out.println(a);
    }
}
 