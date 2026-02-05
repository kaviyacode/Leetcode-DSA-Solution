class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        int carry=1;
        int sum=0;
        for(int i=n;i>=0;i--)
        {
            sum=digits[i]+carry;
            if(sum==10)
            {
                digits[i]=0;
                carry=1;
            }
            else
            {
                digits[i]++;
                carry=0;
                break;
            }
        }
        if(carry==1)
        {
            digits=new int[n+2];
            digits[0]=1;
        }
    return digits;
    }
}