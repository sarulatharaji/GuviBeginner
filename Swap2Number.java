package Beginner;
import java.util.*;
public class Swap2Number {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num1=sc.nextInt();
		int temp=num;
		num=num1;
		num1=temp;
		System.out.println("After swapping:"+num+" "+num1);
		sc.close();
	}

}
