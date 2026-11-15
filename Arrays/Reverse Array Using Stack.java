class Solution {
    public void reverseArray(int[] arr) {
        Stack <Integer> st=  new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=st.pop();
        }
    }
}

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: 5 4 3 2 1
// Explanation: After the reverse, array will look like [5, 4, 3, 2, 1].
