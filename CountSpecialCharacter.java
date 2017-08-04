package Beginner;

import java.util.Scanner;

public class CountSpecialCharacter {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>=0&&ch[i]<=47)||(ch[i]>=58&&ch[i]<=64)||(ch[i]>=91&&ch[i]<=96)||(ch[i]>=123&&ch[i]<=255))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
