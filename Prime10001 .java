class Prime10001 
{

	public static void main(String[] args) 
	{
	
		int a = 1;
		for(int i=2;;i++) 
		{
			int b = 0;
			
			for( int k=i;k>=1;k--) 
			{
				if( i % k == 0 ) 
					b++;
			}
				
				if(b == 2) 
				{
	               if( a == 10001 )
	               {
					      System.out.println(i);
					      break;
	               }
	               a++;
	      }
		
	 	}

	 }
}
