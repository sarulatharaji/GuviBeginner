package Beginner;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWord {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		StringTokenizer st=new StringTokenizer(str,"\\s ,|.");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
	}
}