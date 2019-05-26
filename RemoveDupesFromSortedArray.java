
public class RemoveDupesFromSortedArray {
	
	public static int removeDupes(int[] nums){
		if(nums == null || nums.length == 0){
            return 0;
        }
        int maxvalue = nums[0];
        int i = 0;
        int output = 0;
        while(maxvalue <= nums[nums.length-1]){
            
            if(nums[i] == maxvalue){
                nums[output] = maxvalue;
                output++;
                i++;
                maxvalue++;
            } else if (nums[i] < maxvalue){
                i++;
            } else {
                maxvalue++;
                
            }
        }
        
        return output;
    }

public static int main (String[] args) {
	
	int [] dnum = {0,1,1,2,3,5,6,7,7,8,9,10,10,11,11,13,14,16};
	return removeDupes(dnum);
	
	
				
}
}
