import java.util.*;


public class target{

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int value; 
        int temp=0;
        int[] r=new int[5];
        System.out.println("enter  elements in array");
        for(int i=0;i<5;i++)
        {
            r[i]=sc.nextInt();
        }
        System.out.println("user number"); 
        value=sc.nextInt();
          for(int i=0;i<5;i++)
          {
         for(int j=i;j<5;j++)
         {
             if(r[i]+r[j]==value)
             {  temp++;
                 System.out.println(r[i]+"+ "+r[j]+"= "+value);
                 System.out.println("value present in array");
             }
    
          }}
          if(temp==0)
              System.out.println("user number not found");
    }
}
