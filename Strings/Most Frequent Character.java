class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        char ans='z';
        for(char ch:map.keySet()){
            if(map.get(ch)>max ||  (map.get(ch) == max && ch < ans)){
                ans=ch;
                max=map.get(ch);
            }
        }
        return ans;
    }
}

// Input: s = "testsample"
// Output: 'e'
// Explanation: 'e' is the character which is having the highest frequency.