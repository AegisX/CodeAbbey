import java.util.Scanner;

public class SumsInLoop {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter total number of pairs you will enter:");
		int Num = input.nextInt();
		
		System.out.println("Please enter the pairs of numbers to be summed:");
		
		int array[] = new int[Num];
		int sumarray[] = new int[Num];
		
		for(int i=0;i<array.length;i++){
			int first = input.nextInt();
			int second = input.nextInt();
			sumarray[i]=first + second;

		}
		for(int j=0;j<sumarray.length;j++){
			System.out.print(sumarray[j] + " ");
		}
		
		
	}

}
