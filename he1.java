import java.util.Scanner;

	
	public class he1 
	{
		
		
		
		public static void main(String[] args) 
		{
			System.out.println("enter the length");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.println("entere the elemnts");
			int[]arr=new int[n];
			int onestair=0;
			int secstair=0;
			for(int i=0;i<n;i++)
			{
				
				arr[i]=sc.nextInt();
			}
		
			for(int i=0;i<arr.length;i++)
			{
				i++;
				onestair++;
				
				
			}
			System.out.println("onestair-->"+onestair);
			for(int i=2;i<arr.length;i+=2)
			{
				i++;
				secstair++;
				
				
			}
			System.out.println("secstair-->"+secstair);
			
		}

	}
