package guvi;

	import java.io.*;
	import java.util.*;
	public class benefit
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("Price in thousands:");
	for(int i=0;i<10;i++)
	{
	a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	System.out.println(a[9]-1+"thousand");
	}
	}


