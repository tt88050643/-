public class IntToBinary {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        // Write your code here
        int aInt = 0;
        int bInt = 0;
        int resultInt = 0;
        String resultStr = "";
        for(int i=a.length()-1; i>=0; i--){
            aInt = aInt<<1 | (a.charAt(i) - '0');
        }
		
        for(int i=b.length()-1; i>=0; i--){
            bInt = bInt<<1 | (b.charAt(i) - '0');
        }
		System.out.println(aInt);
		System.out.println(bInt);
        resultInt = aInt + bInt;
        if(resultInt == 0){
            return "0";
        }
        for(; resultInt!=0; resultInt=resultInt>>1){
            resultStr = (resultInt & 0x01) + resultStr;
        }
        return resultStr;
    }
}
