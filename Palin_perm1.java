package example;
import java.util.*;

public class Palin_perm1 {
	@SuppressWarnings("rawtypes")
	public static void main(String []args)
	{
		String str = "Himanshu";
		str = str.toLowerCase();
	
		HashMap<Character, Integer> data = new HashMap<Character, Integer>();  		
		for(int i=0; i < str.length(); i++)
		{
			char ind = str.charAt(i);
			if(Character.isLetter(ind) == false)
			{
				continue;
			}
			if(data.containsKey(ind)== false)
				data.put(ind, 1);
			else
				data.put(ind, data.get(ind) + 1);				
		}
		Set<?> st = data.entrySet();
		Iterator<?> i = st.iterator();
		
		int cc = 0;
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			if((Integer)m.getValue()%2 != 0 && cc ==0)
			{
				cc++;
			}
			else if((Integer)m.getValue()%2 != 0)
			{
				System.out.println("False");
				return;
			}
//			System.out.print(m.getKey() + " ");
//			System.out.println(m.getValue());
		}
		System.out.println("True");
	}
}
