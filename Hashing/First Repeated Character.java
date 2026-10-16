class Solution {
	String firstRepChar(String s) {
		// code here
		HashSet<Character> map = new HashSet<>();
		for (int i = 0; i<s.length(); i++) {
			if (map.contains(s.charAt(i))) {
				
				return String.valueOf(s.charAt(i));
			}
			map.add(s.charAt(i));
		}
		return "-1";
	}
}

//Example
//Input : "hello"
//Output : "l"
