package Beginner;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int value=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			System.out.println(i+"*"+value+"="+(i*value));
		}
	}

}
