package package1;
 
public class loopClass{

//print 1 to 5 numbers	
	
	public static void forloopM()
		{
			for(int i = 0; i<=10; i= i+1) 
				{
					System.out.println(i);
				}
							
		}
	
	
    public static void forloopM_2()
    	{
        	int i;
        	          	  
			    for(i = 0; i<=10; i++)
				    {
				    	System.out.println(i);
				    }
						    
		}
		
		
		
    public static void whileM() 
    	{
          		
          	int i=0;
          		
          		while(i<=10) 
          		{
          			i++;
          			System.out.println(i);
          			          			
          		}
          		
          		
        }
 
 
    public static void dowhileM()
    	{
        	int i=0;
          		
        	do {
          			i++;
          			System.out.println(i);
          		}
          		while (i<=10);
          	}
          	
 
 
}