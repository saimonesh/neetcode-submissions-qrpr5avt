class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()){
                    return false;
                }
                Character peek = st.peek();
                switch (ch){
                    case '}':
                        if(peek !='{') return false;
                        break;
                    case ']' :
                        if (peek !='[') return false;
                        break;
                    case ')' :
                        if (peek !='(') return false;
                        break;
                    default: return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    } 
}
