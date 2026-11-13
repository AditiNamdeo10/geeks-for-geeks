class Solution {
    public ArrayList<Integer> filterByDigits(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {

            int curr = arr[i];
            boolean valid = true;

            if(curr <= 0) {
                continue;
            }

            while(curr > 0) {
                int rem = curr % 10;
                curr = curr / 10;

                if(rem != 1 && rem != 2 && rem != 3) {
                    valid = false;
                    break;
                }
            }

            if(valid) {
                ans.add(arr[i]);
            }
        }

        if(ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}

// Input: arr[] = [14, 31, 7]
// Output: [31]
// Explanation: Only 31 has all digits in set {1, 2, 3}