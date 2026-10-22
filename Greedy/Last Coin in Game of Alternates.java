class Solution {
    public int coin(int[] arr) {
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                i=i+1;
            }else{
                j=j-1;
            }
            
        }
        return arr[i];
    }
}

// Input : arr[] = [5, 3, 1, 6, 9]
// Output : 1
// Explanation:
// Players always pick the larger coin from the two ends.
// Pick 9, remaining array: [5, 3, 1, 6]
// Pick 6, remaining array: [5, 3, 1]
// Pick 5, remaining array: [3, 1]
// Pick 3, remaining array: [1]
// Final Output: 1