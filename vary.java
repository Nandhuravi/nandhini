import java.util.Scanner;

	public class vary
	{
       public static void main(java.lang.String[] args) 
		{
			System.out.println("Enter a input(EX:a3b2 not as aa2bc3)");
			Scanner s= new Scanner(System.in);
		    	java.lang.String str= s.nextLine();
		    	char[] st=str.toCharArray();
		    	char lastindex = 0;
		   	StringBuffer sb = new StringBuffer();
		    		for (char sen:st)
		   		 {
		       			 if (!Character.isDigit(sen))
		       			 {
		           			 lastindex = sen;
		        			}
		        			else
		        			{
		            			int n = Integer.parseInt(java.lang.String.valueOf(sen));
		           			 for (int i=0;i<n;i++)
		           			 {
		               			 sb.append(lastindex);
		            			 }           
		        		}
		    }
		    System.out.println(sb.toString());
		 s.close();   
		}
		    	
		    
		}

