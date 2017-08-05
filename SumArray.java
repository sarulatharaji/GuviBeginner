package Beginner;

import java.util.Scanner;

public class SumArray {
	public static int[] sumArray2(int n,int[] array1,int[] array2)
	{
		int sum[]=new int[n];
		for(int i=0;i<n;i++)
		{
			sum[i]=array1[i]+array2[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] array1=new int[n];
	int[] array2=new int[n];
	for(int i=0;i<n;i++)
	{
		array1[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		array2[i]=sc.nextInt();
	}
	int sum[]=sumArray2(n, array1,array2);
	for(int i=0;i<sum.length;i++)
	{
	System.out.println(sum[i]);
	}
	}

}
