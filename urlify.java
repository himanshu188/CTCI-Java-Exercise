package example;

public class urlify {
	public static void main(String []args)
	{
		char c[] = ("Patel Himanshu Syracuse University      ").toCharArray();
		int counter = 0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i] == ' ')
			{
				counter ++;
			}
		}
		int ind=counter/3*2;
		for(int i = c.length-1; i >= ind && counter!=0; i--)
		{
			ind = i-(counter/3)*2;
			if(c[ind]!=' ')
			{
				c[i] = c[ind];
				c[ind] = ' ';
			}
			else
			{
				counter -= 3;
				int j = ind + counter - (counter/3)*1;
				c[j] = '%';
				c[j+1] = '2';
				c[j+2] = '0';

				i-= 2;
				
			}
		}
		System.out.println(c);
	}
}
