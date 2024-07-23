public class max_subarray {
    public  static void max_subarray(int arr[]){
        int n=arr.length;
        int max=0;
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                int sum=0;
                int a[]=new int[(n*(n+1)/2)];
                for (int k=i;k<=j;k++){
                    a[i]=a[k];
                    sum+=arr[k];
                    System.out.print(arr[k]+"  ");
                    if (max<sum){
                        max=sum;
                    }
                }
                 System.out.println();
            }
            System.out.println();
        }
   System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3,6};
        max_subarray(arr);
    }
}
