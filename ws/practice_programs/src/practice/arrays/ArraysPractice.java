package practice.arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, 5)); // 5
		System.out.println(search(new int[] { 3, 6, 8, 2, 4, 9 }, 7)); // -1

	}

	public static int search(int[] nums, int target) {
		
		int ret = -1; 
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				ret =i;
//				return target;
			}
			
		}return ret;

	}

}
