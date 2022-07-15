class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char q=s.charAt(i);
            if(q=='(' || q=='{' ||q=='['){
                stack.push(q);
            }
            
            if(stack.isEmpty()){
                return false;
            }
            char p;
            switch(q){
                case '}':
                    p=stack.pop();
                    if(p=='[' || p=='(')
                    return false;
                    break;
                case ']':
                    p=stack.pop();
                    if(p=='{' || p=='(')
                    return false;
                    break;
                case ')':
                    p=stack.pop();
                    if(p=='[' || p=='{')
                    return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}