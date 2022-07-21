class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2){
            return "";
        }
        char ch[]=s.toCharArray();
        Set<Character> ss=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            ss.add(ch[i]);
        }
        for(int i=0;i<ch.length;i++){
            if((ss.contains(Character.toUpperCase(ch[i]))) && (ss.contains(Character.toLowerCase(ch[i])))){
                continue;
            }
            String s1=longestNiceSubstring(s.substring(0,i));
            String s2=longestNiceSubstring(s.substring(i+1));
            return (s1.length()>=s2.length()?s1:s2);
        }
        return s;
    }
}