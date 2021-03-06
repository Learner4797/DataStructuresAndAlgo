package multithreading;

class BookTicket2{
	
	/*
	 * in this the problem is that one thread which get locks 
	 * it will execute full method and then give lock access 
	 * to other thread-1 so this increase waiting time for other
	 * thread. */
	
//	int TotalSeats=10;
//	synchronized void book(int seats) {
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		if(TotalSeats >= seats) {
//			System.out.println("Seat booked..."+seats);
//			TotalSeats = TotalSeats - seats;
//			System.out.println("Remaining seats:  "+TotalSeats);
//		}else {
//			System.out.println("Can't be booked because only "+TotalSeats+" are available...");
//		}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getName());
//	}
	
	int TotalSeats=10;
	void book(int seats) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized (this) {
			if(TotalSeats >= seats) {
				System.out.println("Seat booked..."+seats);
				TotalSeats = TotalSeats - seats;
				System.out.println("Remaining seats:  "+TotalSeats);
			}else {
				System.out.println("Can't be booked because only "+TotalSeats+" are available...");
			}
		}
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
	
}

public class SynchroBlock extends Thread{
	static BookTicket2 b;
	int seats;
	public void run() {
		b.book(seats);
	}
	public static void main(String[] args) {
		b  = new BookTicket2();
		SynchroBlock ashish = new SynchroBlock();
		ashish.seats = 6;
		ashish.start();
		SynchroBlock karan  = new SynchroBlock();
		karan.seats = 7;
		karan.start();

	}

}
