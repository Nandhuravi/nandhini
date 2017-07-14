import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class recursive {

   
    public static void main(String[] args) {
        
        
         int[] a=new int[10];
        List l=new ArrayList();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=s.nextInt();
            l.add(a[i]);
           
        }
        Collections.reverse(l);
        
        System.out.println("reverse array is"+l);
        
        
    }
}


