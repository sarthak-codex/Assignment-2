class EvenFibonacci 
{

	public static void main(String[] args) 
  {
        int  p = 0, q = 1, r , sum=0;
        
        
        do
        {
           r = p + q;
           p = q;
           q = r;
           
           if( r % 2 == 0)
             {
        	   sum = sum + r;
        	   }
          
        } 
        
        while  ( r < 4000000 );
        
        System.out.println("Sum of even terms upto 4 million is: " +sum);
  }

}
