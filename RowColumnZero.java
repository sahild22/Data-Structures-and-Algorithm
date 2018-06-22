import java.util.Set;
import java.util.TreeSet;

public class RowColumnZero {

    public static void main(String[] args) {
        int[][] arr1 = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        printArray(arr1);
        makeZero(arr1);
        printArray(arr1);
    }

    private static void makeZero(int[][] arr){
        Set<Integer> si = new TreeSet<>();
        Set<Integer> sj = new TreeSet<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 0){
                    si.add(i);
                    sj.add(j);
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(si.contains(i) || sj.contains(j)){
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
