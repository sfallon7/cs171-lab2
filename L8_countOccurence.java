//Sean Fallon
//COMP-171
//Fall-19
//Lab 8

import java.util.Scanner;

public class countOccurence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[100];
		int i = 0;
		int userInput;
		
		System.out.print("Enter the integers between 1 and 100: ");
		
		do {
			userInput = input.nextInt();
			if(userInput > 0 && userInput <= 100) {
			numbers[i] = userInput;
			i++;
			}
			
		}
		while (userInput != 0);
		
		counter(numbers);

	}
	public static void counter(int[] list) {
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 0; j <list.length - 1; j++) {
				if (list[j] == i)
					count++;
			}
			if (count != 0)
			System.out.printf("%d occurs %d %s%n", i, count, count > 1? "times" : "time");
		}
	}
}
