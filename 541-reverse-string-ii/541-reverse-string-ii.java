class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<str.length();i+=2*k){
            int t=i;
            int l=Math.min(i+k-1,str.length()-1);
            while(t<l){
                char m=str.charAt(t);
                str.setCharAt(t, str.charAt(l));
                 str.setCharAt(l, m);
                t++;
                l--;
            }
        }
        return str.toString();
    }
}