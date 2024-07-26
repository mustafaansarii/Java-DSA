public class dutch_national_flag {
    public static void DNF(int arr[]){
        int left,right,mid;
        left=0;
        right=arr.length-1;
        mid=0;
        while (mid<=right) {
            if (arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                mid++;
                left++;
            }else if (arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }else {
                mid++;
            }
        }
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,1,2,0,1,2};
        DNF(arr);
    }

}
