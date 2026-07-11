class Solution {
    public String removeStars(String s) {
        String k="";
        
        Deque<Character> st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
            
            }
            for( char ch : st){
                k=ch+k;
          

        }
          return k;
    }
}