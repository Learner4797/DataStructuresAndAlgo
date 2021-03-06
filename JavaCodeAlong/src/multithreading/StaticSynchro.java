package multithreading;

class BookTheatreTicket{
	static int TotalSeats = 10;
	synchronized void bookSeat(int seats) {
		if(TotalSeats>=seats) {
			System.out.println(seats+" seats booked successfully");
			TotalSeats = TotalSeats - seats;
			System.out.println("Remaining seat: "+TotalSeats);
		}else {
			System.out.println("Seats cannot be booked");
			System.out.println("Seats left: "+TotalSeats);
		}
	}
}
class MyThread1 extends Thread{
	BookTheatreTicket b;
	int seats;
	MyThread1(BookTheatreTicket b,int seats){
		this.b = b;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
class MyThread2 extends Thread{
	BookTheatreTicket b;
	int seats;
	MyThread2(BookTheatreTicket b,int seats){
		this.b = b;
		this.seats = seats;
	}
	public void run() {
		b.bookSeat(seats);
	}
}
public class StaticSynchro {

	public static void main(String[] args) {
		BookTheatreTicket b1 = new BookTheatreTicket();
		MyThread1 t1 = new MyThread1(b1,8);
		MyThread1 t2 = new MyThread1(b1,2);
		t1.start();
		t2.start();
		
		BookTheatreTicket b2 = new BookTheatreTicket();
		MyThread2 t3 = new MyThread2(b2,10);
		MyThread2 t4 = new MyThread2(b2,3);
		t3.start();
		t4.start();

	}

}
