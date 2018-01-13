/**
 *Given an array of integers, every element appears twice except for one. Find that single one.
**/
import java.util.*;

class AppearOnce{
	public static void main(String[] args) {
		System.out.println(findNumber(new int[]{1,2,3,2,1}));
	}

	public static int findNumber(int[] arr){
		HashMap<Integer, Integer> my_map = new HashMap<>();
		int val = 0;
		int result = 0;
		for(int i: arr){
			if(!my_map.containsKey(i)){
				my_map.put(i, 1);
			}else{
				val = my_map.get(i);
				val++;
				my_map.put(i, val);
			}
		}
		for (Map.Entry<Integer, Integer> entry : my_map.entrySet()) {
   	 		if(entry.getValue() == 1){
				result =  entry.getKey();
    		}
    	}
    	return result;
	}
}