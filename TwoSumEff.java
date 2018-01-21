class TwoSumEff{
	public static int[] twoSum(int[] nums, int target) {
		if(nums == null || nums.length < 2){
			return new int[]{0,0};
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++){
			if(map.containsKey(nums[i])){
				return new int[]{map.get(nums[i]), i};
			}else{
				map.put(target-nums[i], i);
			}
		}
		return new int[]{0,0};
	}

	public static void main(String[] args) {
		int[] nums = {2, 11, 15, 16, 20, 7, 21}; 
		int target = 9;
		printAll(twoSum(nums, target));
	}

	public static void printAll(int[] arr){
		for(int i : arr){
			System.out.println(i);
		}
	}

}