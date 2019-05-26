
/*
 * Author Deepa Subramanian (@Dsubramanian)
 * Verifies Palindrome at String level in a input string
 */
import java.util.Scanner;

public class Palindrome2 {
	 public static void main(String[] args) {
		 
		 Scanner s1 = new Scanner(System.in);
		 System.out.println("Please enter a string: ");
		 String palinword = s1.nextLine();
		String rev = new StringBuffer( palinword).reverse().toString();
		 
		 if(palinword.equals(rev)){
			 System.out.println("Palindrome");
		 }else{
			 System.out.println("Not palindrome");
		 }
	 }
}
