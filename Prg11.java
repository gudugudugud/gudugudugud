class  Prg11
{
	public static void main(String[] args) 
	{
		int a =100;
		int sum = 0;
		while (a<=200)
		{
			if (a%10 == 3 || a%10 == 7)
			{
				sum = sum + a;
			}
			a++;
		}
		System.out.println (sum);
	}
}
