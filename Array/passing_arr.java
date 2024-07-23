public class passing_arr {
    public static void pass(int arr[]){
        for (int i=0; i< arr.length; i++){
            arr[i]=arr[i]+1;
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int marks[]=new int[10];
        pass(marks);
        marks[0]=5;
        marks[1]=5;
        marks[2]=5;
        for (int i=0; i< marks.length; i++){
            System.out.print(marks[i]);

    }
        System.out.println();
    pass(marks);
    }
}
