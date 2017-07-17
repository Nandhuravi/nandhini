import java.util.*;
	public class div1{
		public static void main(String[] args) {
			Scanner sc1=new Scanner(System.in);
			int a=sc1.nextInt();
			Scanner sc2=new Scanner(System.in);
			int b=sc2.nextInt();
			int rem=0,diff=0;
			while(a>=b)
			{
				diff=a-b;
				a=diff;
				rem++;
			}
			System.out.println("quotient :"+rem+" rem:"+diff);
			}
		}
