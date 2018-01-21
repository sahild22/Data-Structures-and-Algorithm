import java.util.ArrayList;

class inter{
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(22);
		l.add(11);
		l.remove(11);
		for(int i: l){
			System.out.println(i);
		}


	}
}