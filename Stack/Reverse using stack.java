class Solution {
    public String reverse(String s) {
        Stack<Character> st= new Stack<>();
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            sc.append(st.pop());
        }
        return sc.toString();
        
    }
}