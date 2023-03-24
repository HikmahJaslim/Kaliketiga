import java.util.Scanner;

public class Assignments3 {
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Retailprice");
		double Retailprice = input.nextDouble();
		
		System.out.println("Salestax");
		double SalesTax = input.nextDouble();
		
		double total_Salestax = Retailprice*SalesTax/100;
		double total = Retailprice + total_Salestax; 
		
		System.out.println("Sales Tax="+ String.format("%.3f", total_Salestax ));
		System.out.println("Total Sales="+ String.format("%.3f", total));
		//NURUL HIKMAH BINTI JASLIM
		//210327
		//LAB 2
	}
	}
