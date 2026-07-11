class Solution {
    public String removeStars(String s) {
        String k="";
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
            
            }
            for( char ch : st){
                k=k+ch;
          

        }
          return k;
    }
}