/*
File Name: Boolean Logic
Author: Jim Li
Date Created: Feb. 23, 2026
Date Last Modified: Feb
*/

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		String word1 = input.nextLine();
		char letter1 = word1.charAt(0);
		System.out.print("Input another lowercase letter: ");
		String word2 = input.nextLine();
		char letter2 = word2.charAt(0);
		System.out.println(letter1 < letter2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(0 <= num && num <= 10);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num > 0 && num != 5);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.println(word.compareTo("banana") != 0);
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int int1 = input.nextInt();
		System.out.print("The integer " + int1 + " is ");
		System.out.println(int1 % 2 == 0);
	}

}
