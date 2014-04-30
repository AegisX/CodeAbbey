import java.util.Scanner;

public class SUMAB {
	public static void main(String args[]){
		
		Scanner grabdata = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		int firstNum = grabdata.nextInt();
		System.out.println("Please enter the second number: ");
		int secondNum = grabdata.nextInt();
		
		int sum = firstNum + secondNum;
		
		System.out.println("The sum of" + firstNum + " + " + secondNum + " is " + sum);
		
	}

}
