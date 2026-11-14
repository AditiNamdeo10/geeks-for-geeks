class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
  
        int minele =arr[0], maxele=arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            maxele=Math.max(maxele,arr[i]);
            minele=Math.min(minele,arr[i]);
        }
        ans.add(minele);
        ans.add(maxele);
        return ans;
        
    }
}

// Input: arr[] = [1, 4, 3, 5, 8, 6]
// Output: [1, 8]
