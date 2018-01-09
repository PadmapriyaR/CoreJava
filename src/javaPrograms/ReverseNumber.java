package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public void reverseNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int number1, reverse = 0;
		while(number!=0) {
			number1 = number;
			number = number1/10;
			reverse = reverse * 10;
			reverse = reverse + number1%10;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverseNumber();
	}
}
