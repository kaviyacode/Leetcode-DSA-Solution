class Solution {
    public boolean isPowerOfFour(int n) {
        int pow=0;
        int num=0;
        if(n<1)
        {
            return false;
        }
        if(n==1)
        {
            return true;
        }
        if(n%2==0)
        {
        while(pow<n)
        {
            pow=(int)Math.pow(4,num);
            if(pow==n)
            {
                return true;
            }
            num++;
        }
        }
    return false;
    }
}