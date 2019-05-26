
public class countNumWordsInString {

	public static void main(String[] args) {
		// 
		String[] countWords = {"Java", "is", "Awesome"};
		for(String input : countWords){
			System.out.printf(" " + input);
		 System.out.println(" : spilt method of words:  " + countWordString(input));
		}

	}
	private static Object countWordString(String input) {
		if(input == null || input.isEmpty()){
			return 0;
		}
		
		String[] words = input.split("\\s+");
		return words.length;
	}
	}

