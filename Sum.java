import java.util.Scanner;

	public class Sum {
		public static void check(int[] duparr)
		{
			int flag=0;
			for(int i=0;i<duparr.length;i++)
			{
				for(int j=i+1;j<duparr.length;j++)
				{
					if(i!=j)
					for(int k=j+1;k<duparr.length;k++)
					{
						if(duparr[i]+duparr[j]==duparr[k])
						{
							System.out.println("array["+i+"]"+"array["+j+"]"+"array["+k+"]"+" = "+ duparr[i]+duparr[j]+duparr[k]);
							flag++;
						}
						else
						{
							System.out.println("no such elemnts");
							flag++;
						}
						if(flag!=0)
							break;
					}
					if(flag!=0)
					{
						break;
					}
				}
				if(flag!=0)
					break;
			}
			
		}

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the number of elements in array");
			int size=scanner.nextInt();
			int[] array=new int[size];
			for(int i=0;i<array.length;i++)
			{
				array[i]=scanner.nextInt();
			}
			Sum.check(array);
			scanner.close();

		}

	}
