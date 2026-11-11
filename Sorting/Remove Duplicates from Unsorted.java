class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])) {
                ans.add(arr[i]);
                set.add(arr[i]);
            }
        }

        return ans;
    }
}

//Example 1:
// Input: arr[] = [1, 2, 3, 1, 4, 2]
// Output: [1, 2, 3, 4]
// Explanation: 2 and 1 have more than 1 occurrence.

//Example 2:
// Input: arr[] = [1, 2, 3, 4]
// Output: [1, 2, 3, 4]
// Explanation: There is no duplicate element.