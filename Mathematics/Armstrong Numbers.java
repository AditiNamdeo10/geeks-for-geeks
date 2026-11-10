class Solution {
    static boolean armstrongNumber(int n) {
        int sum=0;
        int n1=n;
        while(n1>0){
            int rem=n1%10;
            sum+=(rem*rem*rem);
            n1=n1/10;
        }
        return sum==n;
    }
}

// Input: n = 153
// Output: true
// Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. 
