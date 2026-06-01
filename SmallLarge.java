class SmallLarge
{
	public static void main(String[] args) 
	{
		int n=05621;
		int smallnum=9;
		int largenum=0;
		while (n!=0)
		{
			int rem=n%10;
			if (smallnum>rem)
			{
				smallnum=rem;

			}
			if (largenum<rem)
			{
				largenum=rem;
			}
			n=n/10;
		}
		System.out.println("smallest digit is"+smallnum);
		System.out.println("largest digit is"+largenum);
	}
}
