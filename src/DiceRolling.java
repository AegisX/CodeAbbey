import java.util.Scanner;

//Knowing how to generate a random integer between 1-6 (dice) with random x between 0 and 1
// floor(x * (B-A) + A)
public class DiceRolling {
	public static void main(String args[]){
		System.out.print("Please enter the number of cases: ");
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		int array[] = new int[cases];
		
		System.out.println("Please enter your values:");
		for(int i=0;i<cases;i++){
			double temp = 6*input.nextDouble();
			array[i] = (int)temp+1;
			
		}
		
		for(int i=0;i<cases;i++){
			System.out.print(array[i] + " ");
		}
	}

}
