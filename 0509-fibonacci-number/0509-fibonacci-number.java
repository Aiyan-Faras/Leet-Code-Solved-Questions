class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        int first =0,second =1;
        int i=2,fib=0;
        while(i<=n){
            fib = first+second;
            first = second;
            second = fib;
            i++;
        }
        return fib;
            
    }
}