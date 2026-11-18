class Solution {
	int firstElementKTime(int arr[], int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			
			if (map.get(arr[i]) == k) {
				return arr[i];
			}
		}
		
		return - 1;
	}
	
}

// Input: arr[] = [1, 7, 4, 3, 4, 8, 7], k = 2
// Output: 4
// Explanation: Both 7 and 4 occur twice. 
// However, 4 reaches its second occurrence before 7, so the answer is 4.