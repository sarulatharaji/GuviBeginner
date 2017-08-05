package Beginner;

import java.util.Scanner;

public class ShowMessageNotInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int check=sc.nextInt();
		if(check>=start&&check<=end)
		{
			System.out.println(check);
		}
		else
		{
			System.out.println("you entered number is not in range");
		}
	}
}
