public class reverse_arr {
    public static void reverse_arr(int arr[]){
        int right=arr.length-1;
        for (int i=0; i<=arr.length/2; i++){
            int temp=arr[i];
            arr[i]=arr[right];
            arr[right]=temp;
            right --;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverse_arr(arr);
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
