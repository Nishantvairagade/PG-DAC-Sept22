import java.util.Scanner;
class MathOperation
{
static int add(int a, int b)
{
int sum=a+b;
return sum;
}
static int subtract(int a,int b)
{
int sub=a-b;
return sub;

}
static int multiply(int a,int b)
{
int mul=a*b;
return mul;
}
	static int power(int a,int b)
	{
		int pow=a^b;
		return pow;
	}
		
	
	}
		class Demo
		{
			public static void main(String args[])
			
			
			{
				Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two Numbers");
			int x=sc.nextInt();
			int y=sc.nextInt();
				int sum=MathOperation.add(x,y);
				int sub=MathOperation.subtract(x,y);
				int mul=MathOperation.multiply(x,y);
				int mul=MathOperation.multiply(x,y);
				int pow=MathOperation.power(x,y);
				System.out.println("sum="+sum);
                System.out.println("sub="+sub);
					System.out.println("mul="+mul);
					System.out.println("pow="+pow);
			}
		}