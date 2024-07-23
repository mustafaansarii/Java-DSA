public class buy_and_sell_stock {
    public static void stock(int arr[]){
        int max=0;
        int min=arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]-min>max){
                max=arr[i]-min;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int arr[]={17,-10,-5,13,11,14};
        stock(arr);

    }
}
