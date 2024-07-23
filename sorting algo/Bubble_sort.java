public class Bubble_sort {
    public static void bubble_sort(int arr[]){
        int n=arr.length;
        boolean swapped;
        for (int i=0; i<n; i++){
            swapped=true;
            int swape=0;
            for (int j=0; j<n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swape+=1;
                    swapped=false;
                }
            }
            System.out.println(swape);
            if (!swapped){
                break;
            }
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        bubble_sort(arr);
    }
}
