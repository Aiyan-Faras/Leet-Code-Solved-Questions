class Solution {
    public int compress(char[] chars) {
        int resindex=0, i=0;
      
        while(i!=chars.length){
            char curr = chars[i];
            int count =0;
            while(i<chars.length && curr == chars[i]){
                i++;
                count++;
            }
            chars[resindex++] = curr;
            if(count!=1){
                for(char ch : Integer.toString(count).toCharArray()){
                    chars[resindex++] = ch;
                }
            }
        }
        return resindex;
    }
}