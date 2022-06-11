class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = Arrays.stream(nums).sum();
        if(sum == x){
            return nums.length;
        }
        if(sum < x){
            return -1;
        }
        int left = 0, right = 0, n = nums.length, currentSum = 0;
        int targetSum = sum - x;
        int maxSubArraySize = Integer.MIN_VALUE;
        while(right < n){
            currentSum += nums[right];
            while(currentSum > targetSum){
                currentSum -= nums[left];
                left++;
            }
            if(currentSum == targetSum){
                maxSubArraySize = Math.max(maxSubArraySize,right-left+1); 
            }
            right++;
        }
        
        if(maxSubArraySize == Integer.MIN_VALUE){
            return -1;
        }else{
            return nums.length - maxSubArraySize;
        }
    }
}