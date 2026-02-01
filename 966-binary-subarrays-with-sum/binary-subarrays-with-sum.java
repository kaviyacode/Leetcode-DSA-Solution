class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       int i1=0,i2=0;
       int sum1=0,sum2=0;
       int result=0; 
       for(int j=0;j<nums.length;j++){
        sum1=sum1+nums[j];
        sum2=sum2+nums[j];
        while(i1<=j && sum1>goal)
        {
            sum1=sum1-nums[i1++];
        }
        while(i2<=j && sum2 >= goal)
        {
            sum2=sum2-nums[i2++];
        }
        result = result + i2-i1;
       }  
       return result;
    }
}