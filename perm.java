package example;

public class perm {

	public static void main(String []args)
	{
		String a = "abbc";
		String b = "bcab";
		if(a.length() != b.length())
		{
			System.out.println("False");
		}
		
		int abc[] = new int[65];
		for(int i=0;i< a.length(); i++)
		{
			int c = a.charAt(i);
//			System.out.println(c - 97);
			abc[c - 97] += 1;
		}
//		System.out.println(abc[2]);
		int bc[] = new int[65];
		for(int i=0;i< b.length(); i++)
		{
			int c = b.charAt(i);
//			System.out.println(c - 97);
			bc[c - 97] += 1;
		}		
		for(int i=0;i< b.length(); i++)
		{
			if(abc[i]!=bc[i])
			{
				System.out.println("Permutation is not there");
				break;
			}
		}		
		System.out.println("Permutation is there");				
	}
}
