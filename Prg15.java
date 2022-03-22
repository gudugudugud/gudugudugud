class Prg15 
{
	public static void main(String[] args) 
	{
		int a = 23487;
		int even = 0;
		int odd = 0;
		while (a>0)
		{
			int b = a%10;
				if (b%2==0)
				{
				even =even +b;
				
				}
				else if (b%2==1)
				{
					odd = odd +b;
				}
					a = a/10;
		}
		System.out.println ("sum of even number"+even);
		System.out.println ("sum of odd number"+odd);
	}
}
