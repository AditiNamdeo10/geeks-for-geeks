class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1){
                list.add(arr[i]);
            }
        }
        return list;
        
    }
}
 

// Examples:

// Input: arr[] = [15, 2, 45, 4, 7]
// Output: [2, 4]
// Explanation: Here, arr[2] = 2 exists here and arr[4] = 4 exists.
// Input: arr[] = [1]
// Output: [1]
// Explanation: Here arr[1] = 1 exists.