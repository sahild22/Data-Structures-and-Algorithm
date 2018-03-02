import java.util.*;

// class LetterCombinationsPhoneNumber{
	
// 	// public static List<String> letterCombinations(String digits) {
        
//  //    }

//     public static HashMap createMap(){
//     	HashMap<Integer, String[]> digitMap = new HashMap<>();
//     	digitMap.put(2, new String[]{"a", "b", "c"});
//     	digitMap.put(3, new String[]{"d", "e", "f"});
//     	digitMap.put(4, new String[]{"g", "h", "i"});
//     	digitMap.put(5, new String[]{"j", "k", "l"});
//     	digitMap.put(6, new String[]{"m", "n", "o"});
//     	digitMap.put(7, new String[]{"p", "q", "r", "s"});
//     	digitMap.put(8, new String[]{"t", "u", "v"});
//     	digitMap.put(9, new String[]{"w", "x", "y", "z"});

//     	return digitMap;
//     }

//     public static void printMap(HashMap m){
//     		String[] arr = m.get(2);
//     		for(String s: arr){
//     			System.out.println(s);
//     		}
//     }
// 	public static void main(String[] args) {
// 		HashMap myMap = createMap();
// 		printMap(myMap);

// 	}
// }

class LetterCombinationsPhoneNumber{
	public static List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    for(int i =0; i<digits.length();i++){
	        int x = Character.getNumericValue(digits.charAt(i));
	        while(ans.peek().length()==i){
	            String t = ans.remove();
	            for(char s : mapping[x].toCharArray())
	                ans.add(t+s);
	        }
	    }
	    return ans;
	}

	public static void main(String[] args) {
		List<String> ans = letterCombinations("23");
		for(String ss: ans){
			System.out.println(ss);
		}
	}
}