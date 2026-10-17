class Solution {
    public void swapElements(int[] arr) {
        // code here
        if(arr.length<2){
            return;
        }
        for(int i=0;i<arr.length-2;i++){
            int temp=arr[i+2];
            arr[i+2]=arr[i];
            arr[i]=temp;
        }
        return;
    }
}

// Input: arr[] = [1, 2, 3]
// Output: [3, 2, 1]

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [3, 4, 5, 2, 1]