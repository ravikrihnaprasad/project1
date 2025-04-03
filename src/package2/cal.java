package package2;

public class cal {
	
//POLYMORPHISM
//method without arguments
	public static void calc() 
		{
			int a = 10;
			int b = 20;
			int c = 30;
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(b/a);
			System.out.println(a+b+c);
			
		}
			
// method with 2 arguments
	
	public static void calc(int num1, int num2) 
		{
			System.out.println(num1+num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			System.out.println(num2-num1);
			
		}
// Method with 3 arguments
	
	public static void calc(int num1, int num2, int num3)
		{
			System.out.println(num1+num2+num3);
			System.out.println(num1*num2*num3);
			System.out.println(num3-num2-num1);
			System.out.println(num3/num2);
		}

}
