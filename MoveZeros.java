class MoveZeros{

	public static void main(String[] args) {
		printArray(moveArray(new int[]{1,2,0,3,0,5}));
	}
	public static int[] moveArray(int[] arr){
		int result = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0){
				arr[result] = arr[i];
				result++;
			}else{
				count++;
			}
		}
		for(int i = result; i < result+count; i++){
			arr[i] = 0;
		}
		return arr;
	}

	public static void printArray(int[] arr){
		System.out.print("{" + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println("}");
	}
}