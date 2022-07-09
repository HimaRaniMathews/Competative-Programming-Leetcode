class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++){
            StringBuilder ss=new StringBuilder(str[i]);
            int f=0;
            int l=str[i].length()-1;
            while(f<l){
                char m=ss.charAt(f);
                ss.setCharAt(f, ss.charAt(l));
                 ss.setCharAt(l, m);
                f++;
                l--;
            }
            str[i]=ss.toString();
            
        }
        String str2=String.join(" ", str);
        return str2;
    }
}