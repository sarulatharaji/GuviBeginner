package Beginner;

import java.util.*;

public class PromptIfNotValid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int check=sc.nextInt();
		try {
			if(check>=start&&check<=end)
			{
				System.out.println(check);
			}
			else
			{
				throw new NumberFormatException("Not in range");
				
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println("Enter number within range");
		}
	}

}
