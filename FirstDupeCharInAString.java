package InterviewPrep;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstDupeCharInAString {
	// To find the first duplicate char in a given string
	// The efficient way is using LinkedHashset - the alog is O(n)
	public static char firstDupe(char str[]) {
		
		/* STEPS:
		 * 1. create an empty LinkedHashset
		 * 2. Traverse through the array
		 * 3. If the element is already present, update the set and then break
		 * 4. Else add element to hash set back
		 */
		
		// Create an empty set
		Set <Character> h = new LinkedHashSet<>();
			for (int i = 0; i<=str.length -1; i++) { //Traverse through the array
				char c = str[i];
				if (h.contains(c))
					return c; //If the element is already present, update the set and then break
				else
					h.add(c); //Else add element to hash set back
			}
		return '\0';
	}
	
	public static void main(String[] args) {
		String str = "NErdy nerd";
		str = str.toLowerCase(); // to change the string to lowercase so that n will be displayed first
		char [] arr = str.toCharArray();
		System.out.println(firstDupe(arr));

	}

}
