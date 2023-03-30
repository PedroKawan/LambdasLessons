package program;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int nums[] = {3, 2, 4};
		
		int[] result = twoSum(nums, 6);
		
		Arrays.stream(result).forEach(a -> {System.out.println(a);;});;
	}
	
	static public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int v;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                v = nums[i] + nums[j];
                if(v == target) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}
