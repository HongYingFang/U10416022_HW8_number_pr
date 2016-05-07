//U10416022
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//new number
		Number number = new Number();
		
		//new scanner
		Scanner input = new Scanner(System.in);
		
		//Let the user enter two numbers(String type) 
		System.out.println("Please enter two numbers.");
		System.out.println("First number:");
		String num1 = input.nextLine();
		System.out.println("Second number:");
		String num2 = input.nextLine();
		
		//Let the user choose a arithmetic
		System.out.println("What kind of calculation do you want ? ");
		System.out.println("1)add 2)subtract 3)multiply 4)divide");
		int cal = input.nextInt();
		
		if(cal==4){
		System.out.println("Enter the number for the digit you want to retain after dot.");
		int scale = input.nextInt();
		//divide method
		number.div(scale,cal,num1,num2);
		}else{		
		//promote method
		number.promote(cal,num1,num2);
		}
	}
}
