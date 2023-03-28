package adv1_bitmaipulation;

public class PerfectPowerOfTwo {
	public static void main(String[] args) {
		int A = 128;
		if((A & (A-1)) == 0) {
			System.out.println("perfect");
		}else {
			System.out.println("imperfect");
		}
	}
}
