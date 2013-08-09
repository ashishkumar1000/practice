package practice;

import java.util.Scanner;

public class MaxOfTwo {
	

	public int intMax(int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;

	}
	
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scnr = new Scanner(System.in);
		a = scnr.nextInt();
		b = scnr.nextInt();
		
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
	}
}
