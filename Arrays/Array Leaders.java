class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int lead=-1;
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=arr.length-1; i>=0 ; i--){
            if(arr[i]>=lead){
                ans.add(arr[i]);
                lead=arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
