class Prg12 
{
	public static void main(String[] args){
		int a=10;
		int sum=0;
		int rem=0;
		while(a<=20){
			if(a%2==0)
			{
				sum=sum+a;

			}
			else if(a%2==1)
			{
				rem=rem+a;
			}

			a++;

		}
		System.out.println("even number sum is"+sum);
			System.out.println("odd number sum is"+rem);

		
	}
}
