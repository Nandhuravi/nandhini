import java.util.*;
	public class possible{

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int no=sc.nextInt();
			String str1=String.valueOf(no);
			no=no+1;
			String str2=String.valueOf(no);
			if(str2.length()>str1.length())
			{
				System.out.println("not possible");
			}
			else
			{
				System.out.println(no);
			}
			
		}

	}

