import java.util.Scanner;


	public class palin1 {
	    public static void main(String[] args){
	         int a,b,c=0,temp;  
	     System.out.println("Enter a number");
	      Scanner ob=new Scanner(System.in);
	 int n=ob.nextInt();
	 temp=n;
	 
	 while(n>0){
	     a=n%10;
	     n=n/10;
	     b=n%10;
	     n=n/10;
	     
	     c=a+b+n;
	 }
	 if(temp==c){
	    System.out.println("palindrome");
	     
	 }
	 else
	     System.out.println("not a palindrome");
	    }
	}

