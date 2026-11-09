class Solution {
    static boolean isPerfect(int n) {
        if(n <= 1) return false;

        int c = 1;

        for(int i = 2; i <= n/i; i++) {
            if(n % i == 0) {
                c += i;

                if(i != n/i) {
                    c += n/i;
                }
            }
        }

        return c == n;
    }
}

// Input: n = 6
// Output: true 
// Explanation: Factors of 6 are 1, 2, 3 and 6.
// Excluding 6 their sum is 6 which is equal to n itself. So, it's a Perfect Number.