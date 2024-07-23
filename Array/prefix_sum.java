public class prefix_sum {
    public static void main(String[] args) {
        int arr[]={1,2,3,-4,5};
        int prefix []=new int[arr.length];
        prefix[0]=arr[0];
        for (int i=1; i<arr.length; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0; i<arr.length;i++){
            System.out.print(prefix[i]+ " ");
        }
    }
}
