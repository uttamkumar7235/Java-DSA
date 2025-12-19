// Trapping Rainwater

public class TrappingRainwater {

    public static int trappedWater(int height[]) {
        int left = 0 , right = height.length-1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            }
            else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }
    
    public static void main(String[] args) {
        int height[] = {4, 2, 6, 3, 2, 5};
        System.out.println("Water trapped : " + trappedWater(height));
    }
}
