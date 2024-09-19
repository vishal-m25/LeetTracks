class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(list, new ArrayList<>(), candidates, target, 0);
    return list;
}

private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int t, int s){
    if(t < 0) return;
    else if(t == 0) list.add(new ArrayList<>(tempList));
    else{ 
        for(int i = s; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, t - nums[i], i); 
            tempList.remove(tempList.size() - 1);
        }
    }
}
}
