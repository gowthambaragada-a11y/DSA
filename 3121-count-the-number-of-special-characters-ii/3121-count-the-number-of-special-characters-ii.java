class Solution {
    public int numberOfSpecialChars(String word) {
        int c =0;
        boolean []L = new boolean[26];
        boolean []U = new boolean[26];
        boolean []in = new boolean[26];
        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(U[ch -'a']){
                    in[ch -'a'] =true;
                }else{
                    L[ch -'a'] = true;
                }
            } else if(Character.isUpperCase(ch)){
                U[ch -'A'] = true;
            }
        }
        for(int i=0;i<26;i++){
            if(L[i] && U[i] && !in[i]){
                c++;
            }
        }
        return c;
    }
}