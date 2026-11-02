class Solution {
    public static String reverseString(String s) {
        
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i++,s.charAt(j));
            sb.setCharAt(j--,temp);
            
        }
        return sb.toString();
    }
}