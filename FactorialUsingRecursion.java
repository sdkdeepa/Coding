import java.util.Scanner;

public class FactorialUsingRecursion {
// Solution one
	public static void main(String[] args) {
    // Find the factorial of a number recursively
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	System.out.println("Please enter an int: " + factorial(n));
      	
    public int factorial(int n) {
			  if (n==1)
		    return 1;
  		    return n*factorial(n-1);
  	}
	}
}

  // Solution two using Recursion:
    public int factorial(int n) {
  // Base case: if n is 1, we can return the answer directly
 if (n == 1) return 1;
  return n * factorial(n-1);
}
