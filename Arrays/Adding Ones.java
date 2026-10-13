class Solution {
	public ArrayList<Integer> update(int n, int[] updates) {
		int[] arr = new int[n + 1];
		
		for (int j : updates) {
			arr[j - 1]++;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			list.add(sum);
		}
		
		return list;
		
	}
}

// Input: n = 2, updates[] = [1, 1, 1]
// Output: [3, 3] 
// Explanation: Initially the array is [0, 0]. After the first 1, it becomes [1, 1]. 
// After the second 1 it becomes [2, 2]. After the third 1, it becomes [3, 3].
