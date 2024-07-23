public class binary_search_loop {
        public static int binary_search_loop(int arr[],int left,int right, int key){
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==key){
                return mid;
            }else if (arr[mid]>key){
                right=mid-1;
            }else if(arr[mid]<key){
                left=mid+1;
            }
        }
        return -1;
}

    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7};
        System.out.println(binary_search_loop(arr,0,arr.length-1,7));
    }
    }