//Sean Fallon
//COMP-171
//Fall-19
//Lab 9

import java.util.Scanner;

public class eliminateDuplicates {
	
		Scanner input = new Scanner(System.in);

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			int[] userNumbers = new int[10];
			int distinctNumbers[] = new int[10]; 
					
			System.out.print("Enter ten numbers: ");
			
			for (int i = 0; i <userNumbers.length; i++)
			userNumbers[i] = input.nextInt();
		
			distinctNumbers = eliminateDuplicates(userNumbers);
			
			System.out.print("The distinct numbers are: ");
			
			for (int i = 0; i < distinctNumbers.length; i++) {
				if (distinctNumbers[i] != -63)
			System.out.print(distinctNumbers[i] + " ");
			}
		}
			static int[] eliminateDuplicates(int[] list) {
				int[] temp = {-63, -63, -63, -63, -63, -63, -63, -63, -63, -63};
				int t;
				for(int i = 0; i<list.length; i++){
					boolean found = false;
					for(int j = 0; j< temp.length; j++) {
						if(list[i] == temp[j]) 
							found = true;
					}
					if(found == false)
						temp[i] = list[i];
				}
				return temp;
		}
		
	}
