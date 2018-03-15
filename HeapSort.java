import java.util.*;

public class HeapSort {
	public static int COMPCOUNT = 0;
    public static void main(String[] args) {
        
    	//int array[] = {12,9,7,15,10};
		int[] array1={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
		int[] array2=new int[32];					//reversely sorted array
		for(int i=31,j=0; i>=0;i--,j++)	{
			array2[j]=array1[i];
		}
		
		Random r = new Random();
        int[] array3 = new int[32];
        for(int i = 0; i < array3.length; i++) {
            array3[i] = r.nextInt(50);				//randomly generated array
        }

		System.out.println("Printing sorted array:");
		printarr(array1);
		System.out.println("Printing reversely sorted array:");
		printarr(array2);
		System.out.println("Printing randomly generated array:");
		printarr(array3);
		System.out.println();

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime1=System.nanoTime();
		heapsort(array1);
		long stopTime1=System.nanoTime();
		double elapsedTime1= (stopTime1-startTime1)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Sorted array: "+ elapsedTime1 +" milliseconds");
		//System.out.println("Printing second ");
		printarr(array1);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime2=System.nanoTime();
		heapsort(array2);
		long stopTime2=System.nanoTime();
		double elapsedTime2= (stopTime2-startTime2)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Reversely Sorted array: "+ elapsedTime2 +" milliseconds");
		printarr(array1);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime3=System.nanoTime();
		heapsort(array3);
		long stopTime3=System.nanoTime();
		double elapsedTime3= (stopTime3-startTime3)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Randomly generated array: "+ elapsedTime3 +" milliseconds");
		//System.out.println("Printing fourth ");
		printarr(array3);

    }

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

    public static void printarr(int[] array){
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}


}
