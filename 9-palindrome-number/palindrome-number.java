class Solution {
    public boolean isPalindrome(int x) {
        // Negative or ends with 0 but not 0 itself → not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;
        while (x > rev) {
            int ld = x % 10;
            rev = rev * 10 + ld;
            x /= 10;
        }

        // If number has odd digits, rev/10 removes the middle digit
        return x == rev || x == rev / 10;
    }
}
