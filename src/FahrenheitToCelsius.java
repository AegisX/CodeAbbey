import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String args[]){
		
		System.out.print("Enter number of conversions: ");
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		System.out.print("Please enter Fahrenheit temperatures: ");
		
		double array[] = new double[cases];
		
		for(int i=0;i<cases;i++){
			int fah = input.nextInt();
			double celsius = (fah-32)*(5.0/9);
			array[i]=celsius;
			
		}
		
		for(int i=0;i<cases;i++){
			System.out.print(Math.round(array[i])+ " ");
		}
		
		
	}

}