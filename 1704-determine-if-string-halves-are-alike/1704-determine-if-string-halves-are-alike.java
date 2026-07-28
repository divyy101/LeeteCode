class Solution {
    public boolean halvesAreAlike(String s) {
        int i=0;
    int c=0,x=0;
        int j=s.length()-1;
        while(i<j){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='U'||ch=='I'||ch=='O'){
c++;

            }
            
            char cc=s.charAt(j);
             if(cc=='a'||cc=='e'||cc=='i'||cc=='o'||cc=='u'||cc=='A'||cc=='E'||cc=='U'||cc=='I'||cc=='O'){
x++;

            }
            i++;
            j--;
        }
        if(c==x)
        return true;
        return false;
        
    }
}