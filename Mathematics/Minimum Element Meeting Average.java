class Solution {
    public int minimumInteger(int[] arr) {
        int n=arr.length;
        int minx=Integer.MAX_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(sum<=(long)n*x){
                minx=Math.min(x,minx);
            }
        }
        return minx;
    }
}

// Input: arr[] = [1, 3, 2]
// Output: 2
// Explanation: The sum of the array is 6. Since 6 ≤ 3 × 2, 2 satisfies the condition. 
// Among all valid integers present in the array, 2 is the minimum.