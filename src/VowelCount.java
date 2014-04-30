import java.util.Scanner;

public class VowelCount {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter number of test-cases: ");
		int cases = input.nextInt();
		
		int array[] = new int[cases];
		System.out.println("Please enter your lines:");
		//Eating the line
		input.nextLine();
		for(int i=0;i<cases;i++){
			 String line = input.nextLine();
			int count=0;
			
			//Cycling through each letter in the line 
			 for(int j=0;j<line.length();j++){
				 
				 // line.toLowerCase(); is applicable
				 if(line.charAt(j) == 'a') count++;
				 else if(line.charAt(j) == 'e') count++;
				 else if(line.charAt(j) == 'i') count++;
				 else if(line.charAt(j) == 'o') count++;
				 else if(line.charAt(j) == 'u') count++;
				 else if(line.charAt(j) == 'y') count++;
			 } 
				array[i]=count;
			
		}
		
		for(int i=0;i<cases;i++){
		System.out.print(array[i] + " ");
		}
	}

}
