class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        remove(0,sb);    
        return sb.toString();
    }
    
    void remove(int pos,StringBuilder sb){
       if(pos>sb.length()-1){
           return;
       }
        if(pos<0)pos=0;
       
        if(pos<sb.length()-1 && sb.charAt(pos)==sb.charAt(pos+1)){
            sb.deleteCharAt(pos+1);
            sb.deleteCharAt(pos);
            remove(pos-1,sb);
        }else{
            remove(pos+1,sb);
        }
    }
}