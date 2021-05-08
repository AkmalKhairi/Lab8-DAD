package Exercise3;

public class ArrayPrinter extends Thread {
	public void arrayPrint() {

		try {
			String arr[] = {"It", "is", "recommended", "to", "use", "Calendar", "class."};
			int redo = 10;
			String result[] = new String[redo];
			for(int i=0, j=0; i<redo && j<arr.length; i++, j++)
			{
				result[i] = arr[j];
				if(j == arr.length -1)
			         j = -1;
				System.out.println("[Normal Array Extraction] => " + i + " array["+i+"] : "+result[i]);
			
				Thread.sleep(5000);
			}
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	public void run() {
		arrayPrint();
	}
}
