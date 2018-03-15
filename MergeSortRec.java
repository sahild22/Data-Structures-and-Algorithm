class MergeSortRec{
	public static void main(String[] args) {
		int[] array = new int[]{2,1,3,10,76,8,11,25,0};
		printArray(array);
		mergeSort(array, 0, array.length - 1);
		printArray(array);

	}

	public static void mergeSort(int[] arr, int start, int end){
		int mid = (int)Math.floor((start + end)/2);
		if(start < end){
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end){
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		for(int i = 0; i < n1 - 1; i++){
			arr1[i] = arr[start + i];
		}
		for(int j = 0; j < n2 - 1; j++){
			arr2[j] = arr[mid + j + 1];
		}
		int i = 0;
		int j = 0;
		int temp = 0;
		for(int k = start; k < end; k++){
			if ((j >= n2) || (i < n1 && arr1[i] <= arr2[j])) {
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
		}
	}

	public static void printArray(int[] arr){
		System.out.print(arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println();

	}
}