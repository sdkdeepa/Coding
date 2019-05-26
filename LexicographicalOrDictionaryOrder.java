
/**
 * @author Deepa Subramanian
 * This program is for arranging the words in dictionary manner without mapping
 *
 */
public class LexicographicalOrDictionaryOrder {

	public static void main(String[] args) {
			      String[] words = {"key1 abcd", "key2 zzz", "key1 hello", "key3 world", "key1 hello"};
			      int n = 5;
//			      System.out.println("Given array: ");
//			      for(int i = 0; i < n; i++) {
//			         System.out.println(words[i]);
//			      }
			      for(int i = 0; i < n-1; ++i) {
			         for (int j = i + 1; j < n; ++j) {
			            if (words[i].compareTo(words[j]) > 0) {
			               String temp = words[i];
			               words[i] = words[j];
			               words[j] = temp;
			            }	
			         }
			      }
			      System.out.println("Lexicographical order of the words are: ");
			      for(int i = 0; i < n; i++) {
			         System.out.println(words[i]);
			      }
			   }
	}


