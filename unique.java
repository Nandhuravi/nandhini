import java.io.*;
	import java.util.*;
	public class unique
	{
	public static void main(String ar[])throws Exception
	{
	int n;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[]=new int[n];
	for( int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	if(arr[i]==i)
	System.out.println("the number"+arr[i]+"is equals to its index"+i);
	}
	}
	}
