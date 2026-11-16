class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        long fact=1;
        int curr=1;
        ArrayList<Long> ans= new ArrayList<>();
        while(fact<=n){
            ans.add(fact);
            
            fact=fact*(++curr);
            
        }
        return ans;
    }
}

// Input: n = 6
// Output: 1 2 6
// Explanation: The first three factorial numbers are less than
// equal to n but the fourth factorial number 24 is greater than n.
// So we print only first three factorial numbers.