package InterviewPrep;


public class FindSumOfMulitiplesOf3n5 {

	public static int sumOf(long n) {
		long num = 0;
			for (int i = 1; i<n; i++) {
				if((i %3 == 0) || (i %5 ==0))
					num += i;
			}
			return (int) num;
	}
	public static void main(String[] args) {
		System.out.println(sumOf(100));
		
	}

}
