package package1;

public class greaterNumber {
	
	public static void greaterNumber_1()
		{
			int a = 20;
			int b = 20;
			
				if(a>b) {
					System.out.println("A is greater number");
					
				}
			
				if(b>a) {
					System.out.println("B is greater number");
				}
				
				
				if(a==b) {
					System.out.println("Both are Equal");
				}
				
		}
		
//user would like to find which is the greater number. user only if and else.  without parameters
	
		public static void greaterNumber_2()
		{
			
			int a = 30;
			int b = 20;
			
				
				if(a==b) {
					System.out.println("Both numbers are same");
				}
			
				if(a>b) {
					System.out.println("A is greater number");
				}
			
				else {
					System.out.println("B is greater");
				}
			
		}
		
//user would like to find which is the greater number. user two if conditions.  with parameters
		
		public static void greaterNumber_3(int num1, int num2)
		{
			
				if (num1>num2) {
				System.out.println("Num1 is greater");
			    }
			
			    else {
				System.out.println("Num2 is greater");
			    }
			
			
		}


}
