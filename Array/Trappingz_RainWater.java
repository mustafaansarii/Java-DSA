public class Trappingz_RainWater {
    public static int trap(int[] height) {
        int n=height.length;
        int left_max[]=new int[n];
        int right_max[]=new int[n];
        left_max[n-1]=height[n-1];
        left_max[0] = height[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
        right_max[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--){
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        int trapped_water=0;
        for (int i = 0; i < n; i++){
            trapped_water+=(Math.min(right_max[i],left_max[i])-height[i]);
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trap(arr));

    }

}