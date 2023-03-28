package advtest1;

public class SmallestXOR {
	public static void main(String[] args) {
		int A = 2;
		int B = 29;
		System.out.println(solve(A,B));

	}

	public static int solve(int A, int B) {
		if( A <= 1) {
			return (1 << B)-1;
		}
        int first = first(A);
        int min = Integer.MAX_VALUE;
        int minval = Integer.MAX_VALUE;
        for(int i= (1 << B)-1;i<= (1 << first+B);i++){
            //check bits
            int bits = noofSetBits(i);
            if(bits == B){
                int temp = A ^i;
                min = (temp < minval) ? i : min;
                minval = Math.min(minval,temp);
      
            }
        }
        return min;
    }
    
    public static int first(int A){
        int ans = 0;
        while(A > 0){
            ans++;
            A = A >>1;
        }
        return ans;
    }
    
    public static int noofSetBits(int X){
        int bits = 0;
        while( X > 0){
            bits = bits + (X & 1);
            X = X >> 1;
        }
        return bits;
    }
}
