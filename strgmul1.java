import java.util.Scanner;


public class strintmult {
    public static void main(String[] args)
    {
        String str1="";
        String str2="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st string : ");
        str1 = in.nextLine();
        System.out.println("Enter the 2nd string : ");
        str2 = in.nextLine();
        
        int a = Integer.parseInt(str1.trim());
        int b = Integer.parseInt(str2.trim());
        int c = 0;
        if(a>0 && b>0)
        {
         c=a*b;
        }
        else{
          System.out.println("invalid input");  
        }
        StringBuilder sb=new StringBuilder();
        sb.append(c);
       String res=sb.toString();
       System.out.println("result is : "+res);
    }
}
