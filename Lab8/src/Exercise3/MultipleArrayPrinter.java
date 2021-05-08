package Exercise3;

public class MultipleArrayPrinter {
	public static void main(String[] args) {
		
		Runnable Sleeparr = new SleepArrayPrinter();
		Thread threads = new Thread(Sleeparr);
		threads.setName("Sleep Array Printer");
		
		Thread threads2 = new ArrayPrinter();
		threads2.setName("Array Printer");
		
		threads.start();
		threads2.start();

	}
}
