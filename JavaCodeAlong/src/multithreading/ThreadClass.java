package multithreading;

class A extends Thread{
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
class B extends Thread{
	public void run() {
		int n = 10;
		for(int i=0;i<n;i++) {
			System.out.println("Thread B "+i);
		}
		System.out.println("Exited loop");
	}
}
class C extends Thread{
	public void run() {
		int n = 5;
		for(int i=0;i<n;i++) {
			System.out.println("Thread C "+i);
		}
		System.out.println("Exited loop");
	}
}
public class ThreadClass {
	
	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();
		new A().test();

	}

}
