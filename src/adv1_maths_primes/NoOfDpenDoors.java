package adv1_maths_primes;

public class NoOfDpenDoors {
	public static void main(String[] args) {
		System.out.println(solve(36));
		
	}
	
	//TC = O(n)
	//SC = O(1)
	//For every square root satisfies count++;
	public static int solve(int A) {
        int openDoors = 0;
        for(int i=1;i*i <= A;i++){  // i <= 1,2,9,16,25
        	//System.out.println(i);
            if(i*i <= A){
                openDoors++;
            }
        }
        return openDoors;
    }
	
	//TC = O(1)
	//SC = O(1)
	//Sqrt of number 
	//count = (int)sqrt(A);
	public static int solve1(int A) {
		return (int)Math.sqrt(A);
	}
}
