class Display{
	public static synchronized void wishGoodMorning(String name){
		for(int i = 0; i <= 10; i++){
			System.out.print("Good Morning: ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}

	public void run(){
		d.wishGoodMorning(name);
	}
}

class ThreadSync{
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "James");
		MyThread t2 = new MyThread(d2, "Sam");

		t1.start();
		t2.start();
	}
}