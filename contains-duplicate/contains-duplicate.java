class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<Integer>(n);
        for(int num : nums){
            if(hs.contains(num)){
                return true;
            }else{
                hs.add(num);
            }
        }
        return false;
    }
}