package multithreading;

class Tables{
	 synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread4 extends Thread{
	Tables t;
	MyThread4(Tables t){
		this.t = t;
	}
	public void run() {
		t.printTable(3);
	}
}
class MyThread5 extends Thread{
	Tables t;
	MyThread5(Tables t){
		this.t = t;
	}
	public void run() {
		t.printTable(10);
	}
}

public class SynchronizationEx {

	public static void main(String[] args) {
		Tables obj = new Tables();
		MyThread4 t1 = new MyThread4(obj);
		MyThread5 t2 = new MyThread5(obj);
		t1.start();
		t2.start();
	}

}
