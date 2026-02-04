class Solution {
    public boolean isHappy(int n) {
        Set<Integer>s=new HashSet<>();
        while(true){
            if(n==1)return true;
            s.add(n);
            int t=0;
            while(n>0){
                int tem=n%10;
                t+=tem*tem;
                n/=10;
            }
            n=t;
            if(s.contains(n))return false;
        }
    }
}