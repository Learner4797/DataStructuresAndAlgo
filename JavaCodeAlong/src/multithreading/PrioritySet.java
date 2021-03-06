package multithreading;

class ThreadA extends Thread{
	public void run() {
		int n = 15;
		for(int i=0;i<n;i++) {
			System.out.println("Thread A "+i);
		}
		System.out.println("Exited loop");
	}
	void test() {
		System.out.println("Inner method in thread class");
	}
}
class ThreadB extends Thread{
	public void run() {
		int n = 10;
		for(int i=0;i<n;i++) {
			System.out.println("Thread B "+i);
		}
		System.out.println("Exited loop");
	}
}
class ThreadC extends Thread{
	public void run() {
		int n = 5;
		for(int i=0;i<n;i++) {
			System.out.println("Thread C "+i);
		}
		System.out.println("Exited loop");
	}
}
public class PrioritySet {

	public static void main(String[] args) {
		A thread1 = new A();
		B thread2 = new B();
		C thread3 = new C();
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(thread1.getPriority()+1);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread2.start();

	}

}
