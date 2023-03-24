import java.util.Scanner;

public class Assignments4 {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers from 0 to 1000");
		int number = input.nextInt();
		int no = 1;
		int no1 = 1 + (number - 100) / 100;
		int no2 = (1 + (number - 10) /10) % 10;
		int no3 = number % 10;
		
		int total = no1 * no2 * no3;		
				
		System.out.println("The total integer multiplied =" + total);
		// NURUL HIKMAH BINTI JASLIM
		//210327
		//LAB 2
	}	
    }
