class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=i+1;
        int[] res = new int[2];
        while(i<nums.length-1)
        {
            if(nums[i]+nums[j]==target)
            {
               return new int[]{i,j};
            }
            j++;
            if(j==nums.length)
            {
                i++;
                j=i+1;
            }
        }
    return new int[0];   
    }
}