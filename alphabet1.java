import java.util.*;
	public class alphabet1{

	     public static void main(String []args){
	         Scanner sc = new Scanner( System.in );
	         char n;
	        System.out.println("enter a character");
	        n = sc.next(".").charAt(0);
	        if(n>'a'&&n<'z'||n>'A'&&n<'z')
	            System.out.println("alphabet");
	        else    
	                System.out.println("not alphabet");
	     }
	}

