import java.util.Scanner;
import java.util.Arrays;

public class MedianOfThree {
	public static void main(String args[]){
		System.out.print("Please enter number of triplets:");
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		
		System.out.println("Please enter your triplets:");
		
		int array[] = new int[cases];
		
		for(int i=0;i<cases;i++){
			int temptarray[] = new int[3];
			temptarray[0] = input.nextInt();
			temptarray[1] = input.nextInt();
			temptarray[2] = input.nextInt();
			Arrays.sort(temptarray);
			
			array[i] = temptarray[1];
			
		}
		
		//System.out.print(Arrays.toString(array));
		for(int i=0;i<cases;i++){
			System.out.print(array[i] + " ");
		}
	}

}
