import java.util.Scanner;

/*
 * Author Deepa Subramanian (@Dsubramanian)
 * Verifies Palindrome at character level in a input string
 */
public class Palindrome {
	 public static void main(String[] args) {
		String s = "";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String to verify if the given string is a plaindrome");
		s = sc.nextLine();
			for (int i =0, j=s.length() -1; i<j; ++i, --j){
				if (s.charAt(i) != s.charAt(j)){
					System.out.println("Not Palindrome at character level");
				} else{
					System.out.println("Palindrome check for character");
			}
		}
	 }
}
		
