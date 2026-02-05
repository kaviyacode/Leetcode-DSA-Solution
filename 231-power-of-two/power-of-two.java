class Solution {
    public boolean isPowerOfTwo(int n) {
        int pow=0;
        int num=0;
        if(n==1)
        {
            return true;
        }
        if(n%2==0)
        {
            while(n>pow)
            {
              pow=(int)Math.pow(2,num);
              if(n==pow)
              {
                return true;
              }
              num++;
            }
        }
    return false;
    }
}