class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
        String[] x=sentences[i].split(" ");
        max=Math.max(x.length,max);
        }
        return max;
    }
}