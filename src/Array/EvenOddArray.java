package Array;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		int[] b = new int[5];
		int coue =0;
		int couo = 0;

		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			b[i] = input;
			
			}

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				System.out.println(b[i] + " " + "even");
			coue = coue+1;
			
			} else {
				System.out.println(b[i] + " " + "odd");
				couo = couo+1;
				
			}
			
		}
		System.out.println("total even number " + coue);
		System.out.println("total odd number " +couo);
	}
}




