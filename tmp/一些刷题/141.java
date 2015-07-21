class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        long middle = 0;
        long low = 1;
        long high = x;
        // write your code here
        if(x==0 || x==1) return x;
        while(low <= high){
            middle = (low + high)/2;
            if(middle*middle == x) return (int)middle;
            if(middle*middle > x){
                high = middle - 1;
            }else if(middle*middle < x){
                low = middle + 1;
            }
        }
        return (int)high;
    }
}
