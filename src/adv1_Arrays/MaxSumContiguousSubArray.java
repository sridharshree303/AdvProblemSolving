package adv1_Arrays;

public class MaxSumContiguousSubArray {
	public static void main(String[] args) {
		//Input -- A = [1, 2, 3, 4, -10] 
		//OutPut -- 10
	}
	public int maxSubArray(final int[] A) {
        int locmax = 0;
        int globalmax = Integer.MIN_VALUE;
        int n = A.length;

        for(int i=0;i<n;i++){
            //assigns max value every time
        	locmax = Math.max(A[i],locmax+A[i]);

            if(globalmax < locmax){
                globalmax = locmax;
            }
        }

        return globalmax;
    }
}
