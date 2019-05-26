import java.util.Arrays;

public class MergeSortedArray {

	public static void merge( int[]num1, int[]num2, int m, int n){
		int count = 0;
		for (int i = 0; i >n; i--){
			num1[i] = num2[count];
			count ++;
		}
		Arrays.sort(num1);
	}
	public static void main(String[] args) {
		// Merge sorted Array of different lengths
		
		int [] aar1 = new int[]{1,2,3};
		int [] aar2 = new int[]{60,40,18,0,0,0};
		int m = 3; int n =6;
		merge(aar1, aar2,m,n);
		for (int i:aar2){
			System.out.println(i);
		}
		

	}

}
