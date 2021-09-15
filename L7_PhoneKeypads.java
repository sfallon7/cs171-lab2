//Sean Fallon
//COMP-171
//Fall-19
//Lab 7

import java.util.Scanner;

public class PhoneKeypads {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//enter string
		System.out.print("Enter a string (e.g. 1-800-Flowers): ");
		String phoneName = input.nextLine();
		
		//get digit for each character in the string
		for (int i = 0;i < phoneName.length(); i++) {
			
			if (Character.isLetter(phoneName.charAt(i)))
					System.out.print(getDigit(Character.toUpperCase(phoneName.charAt(i))));
			else
				System.out.print(phoneName.charAt(i));
		}
		
		input.close();
	}
	
	public static int getDigit(char letter) {
		
		if (letter <= 'C')
			return 2;
		
		else if (letter <= 'F')
			return 3;
		
		else if (letter <= 'I')
			return 4;
		
		else if (letter <= 'L')
			return 5;
		
		else if (letter <= 'O')
			return 6;
		
		else if (letter <= 'S')
			return 7;
		
		else if (letter <= 'V')
			return 8;
		
		else
			return 9;
	}
}
