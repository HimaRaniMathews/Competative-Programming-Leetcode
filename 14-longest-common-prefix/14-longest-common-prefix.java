class Solution {
    public String longestCommonPrefix(String[] strs) {
     if(strs==null || strs.length==0)   return "";
     Arrays.sort(strs);
    int c=0;
        String f=strs[0];
        String l=strs[strs.length-1];
        while(c<(f.length())){
            if(f.charAt(c)==l.charAt(c)){
                c++;
            }
            else{
                break;
            }
        }
        return c==0?"":f.substring(0,c);
    }
}
