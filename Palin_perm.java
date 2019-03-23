package example;

public class Palin_perm {
	public static void main(String []args)
	{
		String str = "Tact Coa";
		str = str.toLowerCase();
		System.out.println(str);
		int cnt[] = new int[26];
		for(int i=0; i < str.length(); i++)
		{
			int ind = str.charAt(i);	
//			System.out.println(ind - 97);
			if(Character.isLetter(str.charAt(i)))
				cnt[ind - 97]++;							
		}
		int cc = 0;
		for(int i=0; i< cnt.length; i++)
		{
			if(cnt[i]%2 != 0 && cc ==0)
			{
				cc++;
			}
			else if(cnt[i]%2 != 0)
			{
				System.out.println("False");
			}
		}
		System.out.println("True");
	}
}
