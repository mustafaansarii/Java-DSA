public class pairs {
    public static void pairs(int arr[],int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (arr[i]!=arr[j]){
                    System.out.println(arr[i]+ " ,"+ arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8};
        pairs(arr,arr.length);
    }
}
