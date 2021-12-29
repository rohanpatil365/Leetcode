class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
            int len = sentence.split(" ").length;
            if(len > max){
                max = len;
            }
        }
        return max;
    }
}