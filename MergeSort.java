import java.util.Random;
import java.util.*;
import java.text.*;

class MergeSort{
	public static int COMPCOUNT = 0;
	public static void main(String [] args){
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

		//System.out.println("Printing array:");
		//printarr(array);
		System.out.println("Printing sorted array:");
		printarr(array1);
		System.out.println("Printing reversely sorted array:");
		printarr(array2);
		System.out.println("Printing randomly generated array:");
		printarr(array3);
		System.out.println();
/*
        COMPCOUNT = 0;
      	long startTime=System.nanoTime();
		mergesort(array, 0, array.length - 1);
		long stopTime=System.nanoTime();
		double elapsedTime= (stopTime-startTime)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for First array: "+ elapsedTime +" milliseconds");
		System.out.println("Printing first ");
		printarr(array);
*/
/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime1=System.nanoTime();
		mergesort(array1, 0, array1.length - 1);
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
		mergesort(array2, 0, array2.length - 1);
		long stopTime2=System.nanoTime();
		double elapsedTime2= (stopTime2-startTime2)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Reversely Sorted array: "+ elapsedTime2 +" milliseconds");
		//System.out.println("Printing third ");
		printarr(array1);

/*----------------------------------------------------------------------------------------*/
		
		System.out.println();
		COMPCOUNT = 0;
		long startTime3=System.nanoTime();
		mergesort(array3, 0, array3.length - 1);
		long stopTime3=System.nanoTime();
		double elapsedTime3= (stopTime3-startTime3)/1e6;
		System.out.println("Number of comparisons = " + COMPCOUNT);
		System.out.println("Elapsed Time for Randomly generated array: "+ elapsedTime3 +" milliseconds");
		//System.out.println("Printing fourth ");
		printarr(array3);
		
	}

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

		int i=0,j=0;
		for(int k=start; k <= end;k++){
			// if(left[i]<= right[j]){
			if ((j >= l2) || (i < l1 && (COMPARE1(temp1[i], temp2[j])))) {				//j >= l2
				array[k] = temp1[i];
				i++;
			}else {
				array[k]=temp2[j];
				j++;
			}

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
