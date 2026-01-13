class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()>=26){
            boolean a[]=new boolean[26];
            Arrays.fill(a,false);
            for(char i:sentence.toCharArray()){
                a[(int)i-97]=true;
            }
            for(int i=0;i<26;i++){
                if(!a[i])return false;
            }
            return true;
        }
        return false;
    }
}