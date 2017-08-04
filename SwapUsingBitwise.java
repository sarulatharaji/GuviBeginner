package Beginner;

import java.util.Scanner;

public class SwapUsingBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		num=num^num1;
		num1=num^num1;
		num=num^num1;
		System.out.println("After swapping:"+num+" "+num1);
		sc.close();

	}

}
