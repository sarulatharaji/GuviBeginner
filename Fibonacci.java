package Beginner;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=1;
	int num=sc.nextInt();
	int result=0;
	for(int i=1;i<=num;i++)
	{
		if(i==1)
		{
			result=a;
			System.out.println(result);
		}
		if(i==2)
		{
			result=b;
			System.out.println(result);
		}
		result=a+b;
		a=b;
		b=result;
		System.out.println(result);
	}
	}

}
