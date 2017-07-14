import java.util.LinkedHashSet;
	import java.util.Scanner;
	import java.util.Set;
	
	public class duplicate
	{
	public static void main(String[] args)
		{
		System.out.println("enter the String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String s1=str.toLowerCase();
		if(s1!=null||s1.trim().equals(" "))
		{
		Set<String>ls=new LinkedHashSet<String>();
		char[]c=s1.toCharArray();
		for(char c1:c)
		{
			String temp=""+c1;
		ls.add(temp);
		}String out="";
		for(String s:ls)
		{
			out=out+s;
		}
		System.out.println(out);
		}else
		System.out.println("invalid");
}
	
	}
