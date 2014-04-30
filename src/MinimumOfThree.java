import java.util.Scanner;

public class MinimumOfThree {
	public static void main(String args[]){
		
		System.out.print("Please enter the number of triplets: ");
		Scanner input = new Scanner(System.in);
		int testcases = input.nextInt();
		
		System.out.println("Please enter the triplets to be compared:");
		int minimum[] = new int[testcases];
		
		for(int i=0;i<testcases;i++){
			int first = input.nextInt();
			int second = input.nextInt();
			int third = input.nextInt();
			if(first<second){
				if(first<third){
					minimum[i]=first;
				} else minimum[i]=third;
				
			} else if(second<third) minimum[i]=second;
			else minimum[i]=third;
				
			
		}
		
		for(int j=0;j<testcases;j++){
			System.out.println(minimum[j] + " ");
		}
		
	}
}
