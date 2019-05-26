//import java.util.Scanner;
//
//public class FactorialUsingRecursion {
//
//	public static void main(String[] args) {
//		// Find the factorial of a number recursively
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println("Please enter an int: " + factorial(n));
//		
//		
//		public int factorial(int n) {
//			  if (n==1)
//			    return 1;
//			    return n*factorial(n-1);
//			}
//
//	}
//
//}
//
////
////Our Solution:
////
////public int factorial(int n) {
////  // Base case: if n is 1, we can return the answer directly
////  if (n == 1) return 1;
////  
////  // Recursion: otherwise make a recursive call with n-1
////  // (towards the base case), i.e. call factorial(n-1).
////  // Assume the recursive call works correctly, and fix up
////  // what it returns to make our result.
////  return n * factorial(n-1);
////}
