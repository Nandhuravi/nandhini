import java.util.Arrays;
	import java.util.Scanner;
	public class unro1 {
		public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				int a=sc.nextInt();
				int b[]=new int[a];
				int p[]=new int[a];
				for(int i=0;i<a;i++)
				{
					b[i]=sc.nextInt();
					p[i]=b[i];
				}
			   Arrays.sort(b);	
			   int j=0;
			for(int i=0;i<a;i++)
			{
				if(b[j]==p[i])
				{
					System.out.print(a-i);
					break;
				}
			}
		
			}

	
}
