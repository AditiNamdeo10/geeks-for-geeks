class Solution {
    int sumOfSeries(int n) {
        
        int result=0;
        for(int i=0;i<=n;i++){
            result+=(i*i*i);
        }
        return result;
        
    }
}

// Examples:

// Input: n = 5
// Output: 225
// Explanation: 13 + 23 + 33 + 43 + 53 = 225

// Input: n = 7
// Output: 784
// Explanation: 13 + 23 + 33 + 43 + 53 + 63 + 73 = 784
