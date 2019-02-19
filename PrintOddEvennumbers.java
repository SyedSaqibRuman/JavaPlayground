
public class PrintOddEvennumbers {
	enum PrintingTypes{
		ODD, EVEN;
	}
	
	public static void main(String[] args) {
		printOddOrEvenNumbers(1,100,PrintingTypes.EVEN);
		printOddOrEvenNumbers(1,100,PrintingTypes.ODD);
	}
	
	public static void printOddOrEvenNumbers(int startNumber, int endNumber, PrintingTypes type) {
		if(type.equals(PrintingTypes.ODD)) {
			System.out.println("ODD Numbers");
			for(int i = startNumber; i<= endNumber; i++) {
				if(i%2!=0)
					System.out.print(i+" ");
			}
			System.out.println("");
		}else {
			System.out.println("Even Numbers");
			for(int i = startNumber; i<= endNumber; i++) {
				if(i%2==0)
					System.out.print(i+" ");
			}
			System.out.println("");
		}
	}

}
