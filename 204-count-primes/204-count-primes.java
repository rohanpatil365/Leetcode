class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean notPrime[] = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        int rootn = (int)Math.sqrt(n);
        rootn +=1;
        
        int count = 0;
        
        for(int i=2;i<n;i++){
            if(!notPrime[i]){
                count++;
                for(int j=2;j*i < n;j++){
                    notPrime[i*j] = true;
                }
            }
        }
        
        return count;
    }
}