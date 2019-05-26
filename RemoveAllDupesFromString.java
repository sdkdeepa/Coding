import java.util.LinkedHashSet;

public class RemoveAllDupesFromString {

	public static void main(String[] args) {
		String s = "Geeks for Geeks and Nerd for Nerds";
		LinkedHashSet <Character> lhs = new LinkedHashSet<>();
		for (int i =0; i<s.length();i++)
			lhs.add(s.charAt(i));
		for (Character c:lhs)
			System.out.print(c);
		}
		
	}
