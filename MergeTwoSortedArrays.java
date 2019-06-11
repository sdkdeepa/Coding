public class MergeTwoSortedArrays {

	public static void mergeSort( int[]a, int[]b, int n1, int n2, int[] c){
	
		int i=0,j=0,k =0;
		while(i<n1 && j<n2) 
			if (a[i] < b[j]){
				c[k]=a[i];
				k++; i++;
			} else { 
				c[k++] = b[j++];
				//k++; j++;
			}
		while(i<n1)
			c[k++]=a[i++];
//			k++;
//			i++;
		while(j<n2)
			c[k++] = b[j++];
//			k++;
//			j++;		
		}
	
	//helper function
	public static void main(String[] args) {
		// Merge sorted Array of same lengths
		
		int [] a = {3,4,6,10,11,15,27,30,35,60};
		int [] b = {1,5,12,15,17,19,25};
		int n1 = a.length;
		int n2 = b.length;
		
		int [] c = new int[n1 + n2];
		mergeSort(a,b,n1,n2,c);
		for (int i:c){
			System.out.print(i + " ");
		}
		

	}

}
