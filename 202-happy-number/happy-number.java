class Solution {
    public boolean isHappy(int n) {
        int s=0;
        while(n!=1 && n!=4)
        {
            s=0;
            while(n!=0)
            {
                int ld=n%10;
                s=s+(ld*ld);
                n=n/10;
            }
        n=s;
        }
    if(n==1)
    {
        return true;
    }
    return false;
    }
}