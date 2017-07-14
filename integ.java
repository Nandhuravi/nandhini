import java.util.*;
	 
	public class integ {
	   public static void main(String[] args) {
	 
	      int[] a1 = {1,2,3,4,5,6};
	      int[] a2 = {2,3,4};
	      
	 
	      System.out.println(containsAll(a1,a2));
	      System.out.print("set2 is a subset of set1");
	      }
	 
	  public static boolean containsAll(int[] a, int[] b ) {
	      int count=0;
	      for (int x: b) {
	         for (int y: a) {
	            if (y==x){
	               count=count+1;
	            }
	         }
	      }
	      if (count == b.length){
	         return true;
	      } else {
	         return false;
	      }
	}

}
