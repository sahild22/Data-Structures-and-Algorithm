import java.io.*;

class Dog implements Serializable{
	transient int i = 10;
	static int j = 20;
}

class Cat implements Serializable{
	String i = "Cat";
	static int j = 20;
}

class Rat implements Serializable{
	String i = "Rat";
	static int j = 20;
}

class SerializationDemo{
	public static void main(String[] args) throws Exception{
		Dog d = new Dog();
		Cat c = new Cat();
		Rat r = new Rat();
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();

		for(int i = 0; i < 3; i++){
			if(o instanceof Cat){
				Cat myCat = (Cat)o;
				System.out.println(myCat.i + "---" + myCat.j);
			}

			else if(o instanceof Rat){
				Rat myRat = (Rat)o;
				System.out.println(myRat.i + "---" + myRat.j);
			}

			else if(o instanceof Dog){
				Dog myDog = (Dog)o;
				System.out.println(myDog.i + "---" + myDog.j);
			}
		}	
	}
}