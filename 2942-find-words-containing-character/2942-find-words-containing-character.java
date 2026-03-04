class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<words.length;i++)if(c(words[i],x))l.add(i);
        return l;
    }
    boolean c(String s,char c){
        for(char ch:s.toCharArray())if(ch==c)return true;
        return false;
    }
}