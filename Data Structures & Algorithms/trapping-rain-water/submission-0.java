class Solution {
    public int trap(int[] height) {
        int leftMax=height[0], rightMax=height[height.length-1];
        int l=0, r=height.length-1;
        int out=0;
        while(l<r){
            if (leftMax<rightMax){
                l++;
                leftMax=Math.max(leftMax, height[l]);
                out+=leftMax-height[l];
            }else{
                r--;
                rightMax=Math.max(rightMax, height[r]);
                out+=rightMax-height[r];
            }
        }
        return out;
    }
}
