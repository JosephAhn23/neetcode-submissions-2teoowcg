class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int curr=0;
        for (int i=0; i<heights.length;i++){
            for (int j=i; j<heights.length; j++){
                curr=(j-i)*Math.min(heights[i], heights[j]);
                max=Math.max(curr, max);
            }
        }
        return(max);
    }
}
