public class Solution_water_contain {
    public int maxArea(int[] height) {
        int max_water = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;
            int currWater = ht * width;
            max_water = Math.max(max_water, currWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_water;
    }

    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        int a=new Solution_water_contain().maxArea(height);
        System.out.println(a);
    }
}
