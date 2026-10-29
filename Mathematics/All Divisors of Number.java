class Solution {
	public ArrayList<Integer> getDivisors(int n) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i = 1; i <= n / i; i++) {
			if (n % i == 0) {
				ans.add(i);
				
				if (i != n / i) {
					ans.add(n / i);
				}
			}
		}
		
		Collections.sort(ans);
		return ans;
	}
}

