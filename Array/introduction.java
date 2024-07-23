import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Scanner;

public class introduction {
    public static Array intro(Array Arr){
        System.out.println(Arr);
        return Arr;
    }

    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        System.out.println(arr[0]);
        int len=arr.length;
        for (int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
