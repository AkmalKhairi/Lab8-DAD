package Exercise1;

public class MultiPrinterApp {
	public static void main(String[] args) {
		
		Thread printerThread1 = new DatePrinter();
		Thread printerThread2 = new DatePrinter();
		
		printerThread2.start();
		printerThread1.start();
		
		}

}
