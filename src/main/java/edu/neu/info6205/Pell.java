package edu.neu.info6205;

public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("edu.neu.info6205.Pell.get is not supported for negative n");

        if(n<2){
            return n;
        }
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i]=2*dp[i-1]+dp[i-2];
        }

        return dp[n];
    }
}
