class PetternsOfAllQuestions 
{
	public static void main(String[] args) 
	{
		/* (1) 2*2 matrics
		int n=2;
			int m=2;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=m ; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}*/
		/* (2) rectangle
		int n=4;
			int m=5;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=m ;j++ )
				{
					System.out.print("*");
				}
				System.out.println();
			} */
			/*(3) hollow rectangle shape
			  we use the if to creat  the space
			int n=4;
			int m=5;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=m ;j++ )
				{
					if (i==1||j==1||i==n||j==m)
					{
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}*/
			/*

			int n=5;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=i ;j++ )
				{
					System.out.print("8");
				}
				System.out.println();
			}  
			*/
			int n=5;
			for (int i=1;i>=n; i++)
			{
				for (int j=n;j>=1 ;j-- )
				{
					System.out.print("*");
				}
				System.out.println();
			}
			


	}
}
