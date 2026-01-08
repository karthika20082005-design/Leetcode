class Solution {
    public int trap(int[] height) {
        int leftmax=0,rightmax=0,totalwater=0,left=0,right=height.length-1;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(height[left]>leftmax)
                {
                    leftmax=height[left];
                }
                else
                {
                    totalwater+=leftmax-height[left];
                }
                left++;
            }
            else 
            {
                if(height[right]>=rightmax)
                {
                    rightmax=height[right];
                }
                else
                {
                   totalwater+=rightmax-height[right];
                }
                right--;
            }
        }
        return totalwater;
    }
}
