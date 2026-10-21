class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        
        int n=arr.length;
        int []ans= new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]-1]+=1;
        }
        ArrayList<Integer> ans1= new ArrayList<>();
        for(int num:ans){
            ans1.add(num);
        }
        return ans1;
    }
}
