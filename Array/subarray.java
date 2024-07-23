public class subarray {
    public static void subarray(int arr[],int n){
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                for (int k=i; k<j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,10};
        int n=arr.length;
        subarray(arr,n);
    }
}
