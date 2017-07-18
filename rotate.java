import java.util.ArrayList;
	import java.util.Scanner;

	public class rotate
	{
		 
		
		public static void main(String[] args) 
		{   
			System.out.println("enter the length");
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("enter the k digits");
			int k=sc.nextInt();
			ArrayList<Integer>al=new ArrayList<Integer>();
			for(int j=k;j<arr.length;j++)
			{
				al.add(arr[j]);
		
			}
			for(int i=0;i<=k;i++)
			{
				al.add(arr[i]);
			}
			System.out.println(al);
		}
		

	}

