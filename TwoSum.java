/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

class TwoSum{
	public static int[] twoSum(int[] nums, int target){
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = 1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					if(i != j){
						return new int[]{i, j};
					}
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15}; 
		int target = 9;
		printAll(twoSum(nums, target));
	}

	public static void printAll(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}
}