import java.util.Scanner;

public class SumInLoop {
	public static void main(String args[]){
		Scanner myData = new Scanner(System.in);
		
		System.out.println("Please enter total number of values to sum:");
		int totalNum = myData.nextInt();
		int array[] = new int[totalNum];
		System.out.println("Please enter the array of numbers");
		 for(int i=0;i<array.length; i++){
			 array[i] = myData.nextInt();
		 }
		 
		 int sum=0;
		 for (int i=0;i<array.length;i++){
			 sum+=array[i];
			 
		 }
		 System.out.println("The sum of the array of numbers you've entered is " + sum);
	}

}
