class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        Set<Character>s=new HashSet<>();
        for(char ch:word.toCharArray())s.add(ch);
        for(char i='a';i<='z';i++){
            if(s.contains(i) &&s.contains(Character.toUpperCase(i)))c++;
        }
        return c;
    }
}