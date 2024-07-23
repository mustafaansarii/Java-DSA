import java.lang.reflect.Array;

public class Linear_search {
    public static int linear_search(int arr[],int n,int target){
        for (int i=0; i<n; i++){
            if (arr[i]==target){
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int arr[]=new int[12];

        int marks[]={1,2,3,4,5,6,7,8};
        arr[11]=6;
        System.out.println(linear_search(marks,marks.length,6));
    }
}
