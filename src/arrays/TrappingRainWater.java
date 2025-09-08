package arrays;

import misc.annotations.Done;

@Done
public class TrappingRainWater {

    //TC: O(n), SC: O(n)
    public static int trapRainWater(int[] height) {

        int n = height.length;
        int[] rightMax = new int[n];
        int[] leftMax = new int[n];
        int water = 0;

        leftMax[0] = height[0];
        for(int i = 1; i < n-1; i++) {

            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {

            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        for(int i = 0; i < n-1; i++) {

            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return water;
    }

    //TC: O(n), SC: O(1)
    //This is a two-pointer approach
    public static int trapRainWaterCompact(int[] height) {

        int rmax = 0;
        int lmax = 0;
        int water = 0;
        int right = height.length-1;
        int left = 0;

        while(right > left) {

            if(height[left] < height[right]) {

                if(height[left] >= lmax) {
                    lmax = height[left];
                } else {
                    water += lmax - height[left];
                }

                left++;

            } else {

                if(height[right] >= rmax) {
                    rmax = height[right];
                } else {
                    water += rmax - height[right];
                }

                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) {

        //answer should be 6
        System.out.println(trapRainWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        System.out.println(trapRainWaterCompact(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

        //answer should be 9
        System.out.println(trapRainWater(new int[]{4,2,0,3,2,5}));
        System.out.println(trapRainWaterCompact(new int[]{4,2,0,3,2,5}));

        //answer should be 1
        System.out.println(trapRainWater(new int[]{5,4,1,2}));
        System.out.println(trapRainWaterCompact(new int[]{5,4,1,2}));

        //answer should be 0
        System.out.println(trapRainWater(new int[]{5}));
        System.out.println(trapRainWaterCompact(new int[]{5}));

        //answer should be 0
        System.out.println(trapRainWater(new int[]{5,4}));
        System.out.println(trapRainWaterCompact(new int[]{5,4}));
    }
}
