import java.util.Random;

class QuickSort{
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
			quicksort(array, 0, array.length - 1);
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
			quicksort(array1, 0, array1.length - 1);
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
			quicksort(array2, 0, array2.length - 1);
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
			quicksort(array3, 0, array3.length - 1);
			long stopTime3=System.nanoTime();
			double elapsedTime3= (stopTime3-startTime3)/1e6;
			System.out.println("Number of comparisons = " + COMPCOUNT);
			System.out.println("Elapsed Time for Randomly generated array: "+ elapsedTime3 +" milliseconds");
			//System.out.println("Printing fourth ");
			printarr(array3);

		}
	 

		public static void quicksort(int[] array, int start, int end){
			if(COMPARE(start, end)){
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