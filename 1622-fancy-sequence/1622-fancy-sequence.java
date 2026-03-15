class Fancy {

    List<Long> arr = new ArrayList<>();
    long add = 0;
    long mul = 1;
    long MOD = 1000000007;

    public Fancy() {}

    public void append(int val) {

        long v = (val - add + MOD) % MOD;
        v = (v * modInverse(mul)) % MOD;

        arr.add(v);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {

        if(idx >= arr.size()) return -1;

        long v = arr.get(idx);
        v = (v * mul % MOD + add) % MOD;

        return (int)v;
    }

    private long modInverse(long x){
        return power(x, MOD - 2);
    }

    private long power(long a, long b){

        long res = 1;
        a %= MOD;

        while(b > 0){

            if((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }

        return res;
    }
}