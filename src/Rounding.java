import java.util.Scanner;
import java.util.Arrays;

public class Rounding {
	public static void main(String args[]){
		System.out.print("Please enter the number of pairs: ");
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		System.out.println("Enter your pairs to be rounded:");
		
		double array[] = new double[cases];
			
			for(int i=0;i<cases;i++){
				int first = input.nextInt();
				int second = input.nextInt();
				double quotient = (double)first/second;
				array[i]=quotient;
				
		
			}
		
			for(int i=0;i<cases;i++){
				// if we declare math as an int variable i.e. int i = math.round(#) it will not work because math
				// will return a long which cant e implicity casted as u lose precision,
				//solution is to just print math without putting it in a value or 
				//explicitly cast it to an int i.e. in i = (int)math.round(#)
				
				System.out.println(Math.round(array[i]));
			}
			//System.out.println(Arrays.toString(array));
		
		
	}

}
