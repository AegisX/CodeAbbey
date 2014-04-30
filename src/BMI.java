import java.util.Scanner;

public class BMI {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the amount of people: ");
		int cases = input.nextInt();
		
		double array[] = new double[cases];
		System.out.println("Please enter their respective weight(kg) and heights(cm)");
		for(int i=0;i<cases;i++){
			int weight = input.nextInt();
			double height = input.nextDouble();
			double BMI = weight/Math.pow(height,2);
			array[i]=BMI;

		}
		
		for(int i=0;i<cases;i++){
			if(array[i]<18.5) System.out.print("under ");
			else if(array[i]<25.0) System.out.print("normal ");
			else if(array[i]<30) System.out.print("over ");
			else System.out.print("obese ");
		}
	}
}
