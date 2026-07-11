class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> st=new ArrayDeque<>();
        Deque<Character> sm=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else if (s.charAt(i)=='#' && st.isEmpty()){
             continue;
            }
            else{
                st.pop();
            }

        }
         for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                sm.push(t.charAt(i));
            }
            else if (t.charAt(i)=='#' && sm.isEmpty()){
             continue;
            }
            else{
                sm.pop();
            }
            
        }
        String k="";
        String j="";
        for(char ch :st){
            k=ch+k;
        }
        for(char ch:sm){
            j=ch+j;
        }
        if(k.equals(j))
          return true;
         else
         return false; 
        
    }
}