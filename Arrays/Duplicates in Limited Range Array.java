class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        HashMap<Integer,Integer> ans= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> finans= new ArrayList<>();
        for(int auto : ans.keySet()){
            if(ans.get(auto)==2){
                finans.add(auto);
            }
        }
        return finans;
    }
}


// Input: arr[] = [2, 3, 1, 2, 3]
// Output: [2, 3] 