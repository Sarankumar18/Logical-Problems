
class Solution {
    public int reverse(int x) {
        if( x >= Integer.MAX_VALUE  || x <=  Integer.MIN_VALUE )
                return 0;
        long rev =0;
        while( x != 0){
            rev = rev*10 + x%10;
            x= x/10;
            //System.out.println(Integer.MAX_VALUE);     
          }
        return (int)rev;
        
    }
}

public class ReverseInteger {

	public static void main(String[] args) {
		Solution solu = new Solution();
		System.out.println(solu.reverse(345));
	}

}
