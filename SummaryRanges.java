class SummaryRanges{
	public static void main(String[] args) {
		test(new int[]{0,1,2,4,5,7});	
	/* O/P -> ["0 -> 2", "4 -> 5", "7"] */
	}

	public static void test(int[] arr){
		System.out.println("array is: " + printArray(arr));
		System.out.println("Range is: ");
		printList(arr);
	} 

	public static LinkedList findRange(int[] arr){
		LinkedList<String> l = new LinkedList<>();
		int start = 0;
		int end = 0;
		boolean inRange = false;
		for(int i = 1; i < arr.length; i++){
			if(!inRange){
				start = arr[i-1];
				inRange = true;
			}else{

			}
		}
		return l;
	}

	public static void printList(LinkedList l){
		for(String s : l){
			System.out.println(s);
		}
	}

	public static void printArray(int[] arr){
		System.out.print("{" + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println("}");
	}	
}