import java.util.*;
import java.text.*;
class SortingAlgorithms{

	public static int COMPCOUNT = 0;
	public static void main(String[] args){

/*----------------------Array 1----------------------------*/

		Random r1 = new Random();
        int[] array1 = new int[1024];
        for(int i = 0; i < array1.length; i++) {
            array1[i] = r1.nextInt(1024);				//randomly generated array of length 1024 (2 ^ 10)
        }

        int[] array1a = new int[1024];
        for(int i = 0; i < array1a.length; i++) {
            array1a[i] = array1[i];						//randomly generated Copy1 of array 1024
        }

        int[] array1b = new int[1024];
        for(int i = 0; i < array1b.length; i++) {
            array1b[i] = array1[i];						//randomly generated Copy2 of array 1024
        }

        int[] array1c = new int[1024];
        for(int i = 0; i < array1c.length; i++) {
            array1c[i] = array1[i];						//randomly generated Copy3 of array 1024
        }

/*----------------------Array 2----------------------------*/

        Random r2 = new Random();
        int[] array2 = new int[32768];
        for(int i = 0; i < array2.length; i++) {
            array2[i] = r2.nextInt(32768);				//randomly generated array of length 32768 (2 ^ 15)
        }

        int[] array2a = new int[32768];
        for(int i = 0; i < array2a.length; i++) {
            array2a[i] = array2[i];						//randomly generated Copy1 of array 32768
        }

        int[] array2b = new int[32768];
        for(int i = 0; i < array2b.length; i++) {
            array2b[i] = array2[i];						//randomly generated Copy2 of array 32768
        }

        int[] array2c = new int[32768];
        for(int i = 0; i < array2c.length; i++) {
            array2c[i] = array2[i];						//randomly generated Copy3 of array 32768
        }

/*----------------------Array 3----------------------------*/

        Random r3 = new Random();
        int[] array3 = new int[1048576];
        for(int i = 0; i < array3.length; i++) {
            array3[i] = r3.nextInt(1048576);			//randomly generated array of length 1048576 (2 ^ 20)
        }

        int[] array3a = new int[1048576];
        for(int i = 0; i < array3a.length; i++) {
            array3a[i] = array3[i];						//randomly generated Copy1 of array 1048576
        }

        int[] array3b = new int[1048576];
        for(int i = 0; i < array3b.length; i++) {
            array3b[i] = array3[i];						//randomly generated Copy2 of array 1048576
        }

        int[] array3c = new int[1048576];
        for(int i = 0; i < array3c.length; i++) {
            array3c[i] = array3[i];						//randomly generated Copy3 of array 1048576
        }

/*--------------------------Merge Sort Call Begins----------------------------------------*/
		
		System.out.println();
		System.out.println("************************************Merge Sort**********************************************");
		System.out.println();
		System.out.println("Randomly generated array of size: 1,024");
		COMPCOUNT = 0;
		long startTime1=System.nanoTime();
		mergesort(array1a, 0, array1a.length - 1);
		long stopTime1=System.nanoTime();
		double elapsedTime1= (stopTime1-startTime1)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime1 +" milliseconds");
		//System.out.println("Printing First ");
		//printarr(array1a);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		System.out.println("Randomly generated array of size: 32,768");
		COMPCOUNT = 0;
		long startTime2=System.nanoTime();
		mergesort(array2a, 0, array2a.length - 1);
		long stopTime2=System.nanoTime();
		double elapsedTime2= (stopTime2-startTime2)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime2 +" milliseconds");
		//System.out.println("Printing Second ");
		//printarr(array2a);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		System.out.println("Randomly generated array of size: 1,048,576");
		COMPCOUNT = 0;
		long startTime3=System.nanoTime();
		mergesort(array3a, 0, array3a.length - 1);
		long stopTime3=System.nanoTime();
		double elapsedTime3= (stopTime3-startTime3)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime3 +" milliseconds");
		//System.out.println("Printing Third ");
		//printarr(array3a);


/*--------------------------Quick Sort Call Begins----------------------------------------*/

		System.out.println();
		System.out.println("************************************Quick Sort**********************************************");
		System.out.println();
		System.out.println("Randomly generated array of size: 1024");
		COMPCOUNT = 0;
		long startTime1b=System.nanoTime();
		quicksort(array1b, 0, array1b.length - 1);
		long stopTime1b=System.nanoTime();
		double elapsedTime1b= (stopTime1b-startTime1b)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime1b +" milliseconds");
		//System.out.println("Sorted ");
		//printarr(array1b);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		System.out.println("Randomly generated array of size: 32,768");
		COMPCOUNT = 0;
		long startTime2b=System.nanoTime();
		quicksort(array2b, 0, array2b.length - 1);
		long stopTime2b=System.nanoTime();
		double elapsedTime2b= (stopTime2b-startTime2b)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime2b +" milliseconds");
		//System.out.println("Printing third ");
		//printarr(array2b);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		System.out.println("Randomly generated array of size: 1,048,576");
		COMPCOUNT = 0;
		long startTime3b=System.nanoTime();
		quicksort(array3b, 0, array3b.length - 1);
		long stopTime3b=System.nanoTime();
		double elapsedTime3b= (stopTime3b-startTime3b)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time: "+ elapsedTime3b +" milliseconds");
		//System.out.println("Printing fourth ");
		//printarr(array3b);


/*--------------------------Heap Sort Call Begins----------------------------------------*/

		System.out.println();
		System.out.println("************************************Heap Sort**********************************************");
		System.out.println();
		COMPCOUNT = 0;
		long startTime1c=System.nanoTime();
		heapsort(array1c);
		long stopTime1c=System.nanoTime();
		double elapsedTime1c= (stopTime1c-startTime1c)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Sorted array: "+ elapsedTime1c +" milliseconds");
		//System.out.println("Printing second ");
		//printarr(array1c);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime2c=System.nanoTime();
		heapsort(array2c);
		long stopTime2c=System.nanoTime();
		double elapsedTime2c= (stopTime2c-startTime2c)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Reversely Sorted array: "+ elapsedTime2c +" milliseconds");
		//System.out.println("Printing third ");
		//printarr(array1c);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime3c=System.nanoTime();
		heapsort(array3c);
		long stopTime3c=System.nanoTime();
		double elapsedTime3c= (stopTime3c-startTime3c)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Randomly generated array: "+ elapsedTime3c +" milliseconds");
		//System.out.println("Printing fourth ");
		//printarr(array3c);

	}
/*---------------------------Merge Sort Algorithm----------------------------------*/
	public static void mergesort(int[] array, int start, int end){
		if(COMPARE(start, end)){
			int middle = (int)Math.floor((start+end)/2);
			mergesort(array, start, middle);
			mergesort(array, middle + 1, end);
			merge(array, start, middle, end);
		}
	}

	public static void merge(int[] array, int start, int mid, int end){
		int l1 = mid - start + 1;
		int l2 = end - mid;
		int[] temp1 = new int[l1];
		int[] temp2 = new int[l2];

		for(int i = 0; i < l1; i++){
			temp1[i] = array[start + i];
		}

		for(int j = 0; j < l2; j++){
			temp2[j] = array[mid + 1 + j];
		}

		int i=0;
		int j=0;
		for(int k=start; k < end+1;k++){
			// if(left[i]<= right[j]){
			if ((COMPARE((-1)*(j), ((-1)*(l2))+1)) || (COMPARE(i, l1) && (COMPARE1(temp1[i], temp2[j])))) {				//j >= l2
				array[k] = temp1[i];
				i++;
			}else {
				array[k]=temp2[j];
				j++;
			}

		}		

	}


/*---------------------------Quick Sort Algorithm----------------------------------*/


	public static void quicksort(int[] array, int start, int end){
		if(start < end){
			int pivot = partition(array, start, end);
			quicksort(array, start, pivot - 1);
			quicksort(array, pivot + 1, end);
		}
	}

	public static int partition(int[] array, int start, int end){
		int pivot = array[end];
		int i = start;
		int temp;
		for(int j = start; j <= end - 1; j++){
			if(COMPARE1(array[j], pivot)){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
		}
		temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;
	}



/*---------------------------Heap Sort Algorithm----------------------------------*/

 private static void swap(int [] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void pushDown(int [] array, int index, int end) {
        int left = 2 * index + 1;
        if (left > end) {
            left = -1;
        }

        int right = 2 * index + 2;
        if (right > end) {
            right = -1;
        }
        if (left != -1 && COMPAREG(array[left], array[index])) {
            swap(array, left, index);
            pushDown(array, left, end);
        }
        if (right != -1 && COMPAREG(array[right], array[index])) {
            swap(array, right, index);
            pushDown(array, right, end);
        }
    }

    public static void heapify(int [] array, int end) {
        int index;
    	
    	if (end < 0) {	
            index = -1;
        }else{
        	index = (end - 1) / 2;
        }
        while (index >= 0) {				
            pushDown(array, index, end);
            index--;
        }
    }

    public static void heapsort(int [] array) {
        heapify(array, array.length - 1);

        int end = array.length - 1;
        while (end > 0) {
            swap(array, 0, end);
            end--;
            pushDown(array, 0, end);
        }
    }

	public static boolean COMPAREG(int X, int Y){
		COMPCOUNT++;
		if(X > Y){
			return true;
		}else{
			return false;
		}

	}


	public static boolean COMPARE(int X, int Y){
		COMPCOUNT++;
		if(X < Y){
			return true;
		}else{
			return false;
		}

	}

	public static boolean COMPARELE(int X, int Y){
		COMPCOUNT++;
		if(X <= Y){
			return true;
		}else{
			return false;
		}
	}


	public static boolean COMPARE1(int X, int Y){
		COMPCOUNT++;
		if(X <= Y){
			return true;
		}else{
			return false;
		}

	}

	public static void printarr(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}