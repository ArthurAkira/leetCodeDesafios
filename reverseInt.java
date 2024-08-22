class Solution {
    public int reverse(int x) {
        int reversed = 0;
        while(x!=0){
            int lastNumber = x%10;
            reversed += lastNumber;
            reversed = reversed * 10;
            x = x/10;
        }
        reversed = reversed/10;
        if(reversed > Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*reversed);
        }
        return reversed;
    }
}