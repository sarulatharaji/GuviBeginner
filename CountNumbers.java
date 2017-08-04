package Beginner;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
