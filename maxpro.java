import java.util.Scanner;

	public class maxpro {
		public static void main(String arg[]){
			int arr[]=new int[7];
			Scanner ff=new Scanner(System.in);
			for(int i=0;i<7;i++){
				arr[i]=ff.nextInt();
			}
			int pro=1,count=0;
		for(int j=0;j<7;j++){
			if(arr[j]>0){
			pro=pro*arr[j];
			count++;
			}
			
		}
		
		
		if(count==0){
			System.out.println("there is no positive numbers");
		}
		else{
			System.out.println("the product num is"+pro);
		}
		
		}
	}
