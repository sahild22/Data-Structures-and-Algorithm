/**
 *Thread is a part of java.lang package
 * We can prevent thread execution by 3 methods:
 * yield() --> pause temporarily to see if any thread(same priority) is waiting for execution, 
 *			public static native void yield(); transition added is -> Running to ready
 * join() --> public final void join(), if a thread wants to wait for other thread to join it then it will call join method. t1 is waiting for t2, then t1 will call t2.join(). After t2 finishes its completion t1 will continue its execution
 * sleep()
 *
**/

class MyThread extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		//t1.setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		t1.start();
		for(int i = 0; i < 10; i++){
			System.out.println("Main Thread");
		}
	}
}