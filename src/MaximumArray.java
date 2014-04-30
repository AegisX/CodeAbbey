import java.util.Scanner;
import java.util.Arrays;

public class MaximumArray {
	public static void main(String args[]){
		
		//Taking array input
		System.out.println("Please enter your array:");
		Scanner input = new Scanner(System.in);
		int array[] = new int[300];
		for(int i=0;i<array.length;i++){
			int num = input.nextInt();
			array[i]=num;
			
		}
		System.out.print(Arrays.toString(array));
		
		//Finding max
		int max=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]>max) max=array[i];
				
		}
		
		//Finding min
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<min) min=array[i];
			
		}
		
		//Printing solution
			System.out.print("Max: " +max + " Min: " + min);
			
/*
 * A shorter way to do this is to use the Array class function sort(arrayname)
 * Arrays.sort(array);
 * int min = array[0];
 * int max = array[array.length-1];
 * 
 * Short way to print an array is Array.toString(array)
 */
		
	}

}
