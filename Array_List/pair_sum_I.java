import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class pair_sum_I {
    static Boolean pair_sum(ArrayList<Integer> List, int target){
        int left=0;
        int right=List.size()-1;
        int currSum=0;
        while (left!=right) {
            if (List.get(left)+List.get(right)==target) {
                return true;
            }
            if (List.get(left)+List.get(right)<target) {
                left++;
            }
            else{
                right--;
            }

            
        }
        return false;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> List=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(pair_sum(List,5));
    }
    
}
