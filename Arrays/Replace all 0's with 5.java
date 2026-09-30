class Solution {
    public int convertFive(int n) {
        String s=String.valueOf(n);
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans+="5";
            }else{
                ans+=s.charAt(i);
            }
        }
        return Integer.parseInt(ans);
    }
    public static void main(String[] args) {

        Solution obj = new Solution();

        int n = 1004;

        int result = obj.convertFive(n);

        System.out.println("Original Number: " + n);
        System.out.println("Converted Number: " + result);
    }
}

//Time complexity : O(d), where d is the number of digits.
//Space complexity : O(d), for the String used to store the converted number.