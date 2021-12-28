class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int size = n/2 + 1;
        int missing=-1;
        HashSet<Integer> hs = new HashSet<Integer>(size);
        for(int i=0;i<n;i++){
            int num = nums[i];
            if(hs.contains(num)){
                hs.remove(num);
            }
            else{
                hs.add(num);
            }
        }
        for(Integer num : hs){
            missing = num;
            break;
        }
        return missing;
    }
}