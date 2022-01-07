package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			int arr[] = {1,2};
			int div = arr[0]-1/0;
		}
		catch(NullPointerException e) {
			System.out.println("NullPointerException...");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception...");
		}

	}

}
