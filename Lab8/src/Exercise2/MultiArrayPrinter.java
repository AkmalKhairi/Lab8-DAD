package Exercise2;

public class MultiArrayPrinter {
	public static void main(String args[]) {
		Runnable printArray1 = new ArrayPrinter();
		Runnable printArray2 = new ArrayPrinter();
		
		Thread  t1 = new Thread(printArray1, "Thread [txt]");
		Thread t2 = new Thread(printArray2, "Thread [word1]");
		
		t1.start();
		t2.start();
    }
}
