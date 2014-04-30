import java.util.Scanner;

public class MinimumOfTwo {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of test cases to be compared:");
		int testcases = input.nextInt();
		
		System.out.println("Please enter the pairs of numbers to be compared:");
		int array[] = new int[testcases];
		int minimum[] = new int[testcases];
		
		for(int i=0;i<array.length;i++){
			int first = input.nextInt();
			int second = input.nextInt();
			if(first<second) minimum[i]=first;
			else minimum[i]=second;
			
		}
		
		for(int j=0;j<array.length;j++){
			System.out.print(minimum[j] +" ");
		}

		
	}

}
