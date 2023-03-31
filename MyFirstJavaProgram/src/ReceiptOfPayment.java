import java.util.Scanner;

public class ReceiptOfPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Item 1");
		String Item1= input.next();
		// using string as the data type since the input is going to be characters
		
		System.out.println("Quantity");
		int Quantity1 = input.nextInt();
		// the quantity refers to item 1 and the data is in the form of integer
		
		System.out.println("Price");
		double Price1 = input.nextDouble();
		// the price is actually the unit price for item 1 and the data type is double since decimal points might be required 
		// different item has different prices
		
		double Amount1 = Price1*Quantity1;
		System.out.println("Amount = RM"+ String.format("%.2f", Amount1 ));
		// the amount1 is the output for item 1 that is produced from the multiplication of price and quantity
		// the amount1 can vary according to the quantity and price depending on the item
		
		System.out.println("***************************************************************");
		
		System.out.println("Item 2");
		String Item2= input.next();
		// the data type is string because it can consists of a character or more than one characters
		
		System.out.println("Quantity");
		int Quantity2 = input.nextInt();
		// The quantity depends on item 2
		
		System.out.println("Price");
		double Price2 = input.nextDouble();
		// this is the unit price for item 2
		
		double Amount2 = Price2*Quantity2;
		System.out.println("Amount = RM"+ String.format("%.2f", Amount2 ));
		// Amount2 depends on the unit price and quantity of of the second item
		// the amount2 should be set as the output as well as amount1 
		
		System.out.println("***************************************************************");
		
		double Subtotal = Amount1 + Amount2;
		// the Subtotal is the addition of both amount 1 and 2 without implementing any tax or charge
		
		double Government_Tax = 0.06*Subtotal; // the tax is also included in the receipt and it depends on the subtotal 
		double Service_Charge = 0.10*Subtotal; // the service charge is implemented 
		double Total = Subtotal + Government_Tax + Service_Charge;
		// the total is all of the subtotal,tax,and charge combined. 
		// it is also the amount of payment that the customers should pay 
		
		System.out.println("Subtotal = RM"+ String.format("%.2f", Subtotal ));
		System.out.println("Government Tax = RM"+ String.format("%.2f", Government_Tax));
		System.out.println("Service Charge = RM"+ String.format("%.2f", Service_Charge));
		System.out.println("Total = RM"+ String.format("%.2f", Total));
		// These are the four outputs that need to be set at the bottom of the receipt and using the string format with floating data that come in two decimal points
		

	}

}
