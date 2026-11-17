class Solution {
     static String toLower(String s) {
         StringBuilder sb = new StringBuilder();

         for(int i = 0; i < s.length(); i++) {
             char curr = s.charAt(i);

             if(curr >= 'A' && curr <= 'Z') {
                 curr = (char)(curr + 32);
             }

             sb.append(curr);
         }

         return sb.toString();
     }
 }

// Input: s = "ABCddE"
// Output: "abcdde"
// Explanation: A, B, C and E are converted to a, b, c and e thus 
// all uppercase characters of the string converted to lowercase letter.