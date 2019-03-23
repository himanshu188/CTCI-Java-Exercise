package example;

public class uniq {
	public static void main(String []args)
	{
		System.out.println("Unique String");
		String abc = "patel";
		if(abc.length() > 128)
			System.out.println("False");
		boolean arr[] = new boolean[128];
		
		for(int i=0; i < abc.length(); i++)
		{
			int c = abc.charAt(i);
			if(arr[c])
			{
				System.out.println("False");
			}
			
			arr[c] = true;
		}
		System.out.println("True");
	}
}
