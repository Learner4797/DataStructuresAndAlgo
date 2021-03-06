package multithreading;

class Thread1 extends Thread{
	public void run() {
		int n = 15;
		for(int i=0;i<n;i++) {
			System.out.println("Thread A "+i);
			if(i==2) {
				Thread.yield();
			}
		}
		System.out.println("Exited loop");
	}
}
class Thread2 extends Thread{
	public void run() {
		int n = 10;
		for(int i=0;i<n;i++) {
			System.out.println("Thread B "+i);
			if(i==4) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Exited loop");
	}
}
class Thread3 extends Thread{
	public void run() {
		int n = 5;
		for(int i=0;i<n;i++) {
			System.out.println("Thread C "+i);
		}
		System.out.println("Exited loop");
	}
}
public class Lifecycle {

	public static void main(String[] args) {
		Thread2 t2 =new Thread2();
		new Thread1().start();
		t2.start();
		new Thread3().start();
		
		

	}

}
