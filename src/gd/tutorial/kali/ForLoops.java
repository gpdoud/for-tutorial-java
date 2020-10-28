package gd.tutorial.kali;

import java.util.ArrayList;

public class ForLoops {

	public static void main(String[] args) {
		
		// Below is the foreach loop
		
		int[] ints = new int[] { 1, 1, 2, 3, 5, 8, 13 };
		int total0 = 0;
		
		for(int i : ints) {
			total0 += i;
		}
		System.out.println(total0);
		
		int[] odds = new int[] { 1, 3, 5, 7, 9, 11 };
		int totalOdds = 0;
		for(int i : odds) {
			totalOdds += i;
		}
		System.out.println(totalOdds);
		
		
		// Below is the for() loop
		
		int total = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 5 == 0 || i % 7 == 0) {
				total += i; // total = total + i;
			}
		}
		System.out.println(total);
		
		int total2 = 0;
		for(int i = 3; i <= 15; i++) {
			if(i % 2 == 0 ) {
				total2 += i;
			}
		}
		System.out.println(total2);
		
		
		
		
		
		

//		ArrayList<IPrintable> printers = new ArrayList<IPrintable>();
//		
//		IPrintable printer = new Printer();
//		IPrintable laserPrinter = new LaserPrinter();
//		printers.add(printer);
//		printers.add(laserPrinter);
//		
//		for(IPrintable p : printers) {
//			p.Print("AAA");
//		}
		
	}

}
