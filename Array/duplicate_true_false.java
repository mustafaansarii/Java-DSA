/*Question 1: Given an integer array nums, return true if any value appears at least twice in
the array, and return false if every element is distinct.*/

public class duplicate_true_false {
    public static boolean duplicate() {
    int arr[] = {1,1, 2, 3};
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                return true;
            }
        }
    }
    return false;
}

    public static void main(String[] args) {
        System.out.println(duplicate());
    }
}