class Solution {
    public int findDiff(int[] arr) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int n : arr) {
            ans.put(n, ans.getOrDefault(n, 0) + 1);
        }

        int max = 0, min = Integer.MAX_VALUE;

        for (int freq : ans.values()) {
            max = Math.max(max, freq);
            min = Math.min(min, freq);
        }

        return max - min;
    }
}