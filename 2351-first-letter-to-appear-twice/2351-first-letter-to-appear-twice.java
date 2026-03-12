class Solution {
    public char repeatedCharacter(String s) {
        Set<Character>se=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(se.contains(ch))return ch;
            se.add(ch);
        }
        return ' ';
    }
}