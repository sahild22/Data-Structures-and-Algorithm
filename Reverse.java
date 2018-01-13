class Reverse{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
		int k = 3;
		arr = reverse(arr, 0, arr.length-1);
		arr = reverse(arr, 0, k);
		arr = reverse(arr, k+1, arr.length-1);
		printarr(arr);

	}

	public static int[] reverse(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		return arr;
	}

	public static void printarr(int[] arr){
		for(int i: arr){
			System.out.print(i + "    ");
		}
	}
}