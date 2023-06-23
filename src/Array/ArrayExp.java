package Array;

import java.util.Scanner;

public class ArrayExp {

	public static void main(String[] args) {

		int[] arr = new int[5];

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		
		char[] char2 = new char[10];
		char[] char1 = {'a' }; 

		System.out.println(arr1[2]);
		System.out.println(char1[0]);
		
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println("Enter any number");
			Scanner sc = new Scanner(System.in);
			 int input = sc.nextInt() ;
			 
			arr[i] = input;
			
			
		}
		for(int x = 0; x<arr.length; x++) {
			System.out.println(arr[x]);
		}
	}

}

//i[0] = 12; 
//i[1] = 13;
//1[2]=14;
//x[0]=12;
//x[1]= 13;
//x[2]=14;