class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] counter = new int[10];
        for(int digit : digits){
            counter[digit]++;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=100;i<1000;i+=2){
            int d0 = i%10;
            int d1 = (i/10)%10;
            int d2 = i/100;
            
            counter[d0]--;
            counter[d1]--;
            counter[d2]--;
            
            if(counter[d0]>=0 && counter[d1]>=0 && counter[d2]>=0){
                list.add(i);
            }
            
            counter[d0]++;
            counter[d1]++;
            counter[d2]++;
        }
        
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}