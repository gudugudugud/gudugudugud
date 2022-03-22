class Prg14 
{
	public static void main(String[] args) 
	{
	int a= 23487;
	while (a>0)
	{
		int b = a%10;
		if (b%2==1)
		{
			System.out.println (b);
		}
		int b = a%10;
System.out.println (b);
a = a/10;
	}
	}
}
