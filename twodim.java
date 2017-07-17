import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.*;
	import java.util.Set;

	public class twodim {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	Map<String,String> m=new LinkedHashMap<String,String>();
	for(int i=0;i<n;i++)
	{
		m.put(s.next(),s.next());
	}
	String ss=s.next();
	String child = null;
	List<String> list=new ArrayList<String>(m.keySet());
	for(String i:list)
	{
	if(m.containsValue(ss))
	{
		Set set=m.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			if(me.getValue().equals(ss))
			child=(String) me.getKey();
		}
	
	}
	}
	
	int count=0;
	for(String i:list)
	{
		
		if(m.get(i).equalsIgnoreCase(child))
			count++;
	}
	System.out.println(count);
		}

	}
