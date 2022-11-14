class Solution {
    public String reverseWords(String s) {       
        String words[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        int end = words.length;
        for(int i=0; i<end; i++){
            if(!words[i].isEmpty()){
                str.insert(0,words[i]);
                str.insert(0, " ");
            }
        }
        return str.toString().trim();
    }
}