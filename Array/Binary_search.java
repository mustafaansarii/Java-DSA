public class Binary_search {
    public static int binary_search(int arr[],int left,int right, int key){
        if (left<=right){
            int mid=(right+left)/2;
        if (arr[mid]==key){
            return mid;
        }else if (arr[mid]>key){
            return binary_search(arr,left,mid-1,key);
        }else if (arr[mid]<key){
            return binary_search(arr,mid+1,right,key);
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(binary_search(arr,0,arr.length-1,1));
    }
}
