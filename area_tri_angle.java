import  java.util.*;

class j
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int a,b,c,d,s;
		
		System.out.print("enter the 1st no: ");
		a=scan.nextInt();
		System.out.print("enter the 2nd no: ");
		b=scan.nextInt();
		System.out.print("enter the 3rd no: ");
		c=scan.nextInt();
		System.out.print("enter the s no: ");
		s=scan.nextInt();
		
		double ans=s*(s-a)*(s-b)*(s-c);

		System.out.println();
		System.out.println("Area of triangle: "+ Math.sqrt(ans) );
		
		
		
	}
}




