package InterviewPrep;

public class compareWithoutOperator {
	
	//using XOR operator 

	public static void withoutEquals( int a, int b) {
		if((a ^ b) !=0)
			System.out.println("Not Equal");
		else 
			System.out.println("They are equal");
	}
	public static void main(String[] args) {
		
		withoutEquals(10,10);

	}

}
