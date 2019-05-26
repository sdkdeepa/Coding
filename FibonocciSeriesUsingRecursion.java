package InterviewPrep;

import java.util.Scanner;

public class FibonocciSeriesUsingRecursion {
	// recursive way of getting the n position in the fib series
	public static void main(String[] args) {
		
		System.out.println("Enter fib series position that you want to print : ");
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt ();
		System.out.println(fibonocci(n));
	}
	public static int fibonocci(int n) {
		if ((n == 1) || (n==2)){
		return 1;
		} else {
			return fibonocci(n-1) + fibonocci(n-2);
		}
	}
	}
	
