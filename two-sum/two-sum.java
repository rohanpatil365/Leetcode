class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        
        for(int i=0;i<n;i++){
            int x = target - nums[i];
            if(set.contains(x)){
                int j = findSecondIndex(nums,x,i);
                if(j!=-1){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        
        return ans;
    }
    
    public int findSecondIndex(int[] nums, int searchValue, int skipIndex){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == searchValue && i!=skipIndex){
                return i;
            }
        }
        return -1;
    }
}