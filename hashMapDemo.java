import java.util.*;

class HashMapDemo{
	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		addInMap(myMap, "Sam", 21);
		addInMap(myMap, "Sam", 21);
		addInMap(myMap, "Sam", 21);
		addInMap(myMap, "Mick", 22);
		addInMap(myMap, "Mike", 23);
		addInMap(myMap, "Dick", 24);
		addInMap(myMap, "Dick", 24);
		//printMap(myMap);
	}


	public static void addInMap(Map map, String name, int num){
		map.add(name, num);
	}

	// public static void printMap(Map map){
	// 	Set<String> keySet = map.getKeySet();
	// 	for(String s: keySet){
	// 		System.out.println("Key: "+ s + " Value: " + map.getValue(s));
	// 	}
	// }
}