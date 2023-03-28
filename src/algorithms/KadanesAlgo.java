package algorithms;

public class KadanesAlgo {
	
	//Time complexity - O(N)
	//Space complexity - O(1)
	public static void main(String[] args) throws java.lang.Exception {

		int a[] = {5,6,7,-3,2,-10,-12,8,21};
		int b[] = {-2,-1};
		int local_max = 0;
		int global_max = Integer.MIN_VALUE;
		int n = b.length;
		
		//-----------------------------
		//for positive and negative 
		for(int i=0;i<n;i++) {
			local_max = local_max + b[i];
			
			//check max
			if(local_max > global_max)
				global_max = local_max;
			
			//reset
			if(local_max < 0)
				local_max = 0;
		}

//		//-----------------------------
		//for work for only negative also
		for (int i = 0; i < n; i++) {
			local_max = Math.max(b[i], b[i] + local_max);

			if (local_max > global_max) {
				global_max = local_max;
			}

		}
		System.out.println(global_max);
	}
	
}
