import java.util.*;
class j
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Scanner s=new Scanner(System.in);
int input;
float x;
String name;

//*********************************************************
System.out.println("");
System.out.println("------------input-----------");





System.out.println("Enter the required day th : ");
input=scan.nextInt();

System.out.println("------------output-----------");



switch(input%7)
{
case 0:
	{
		System.out.println("Wednesday");
break;
	}
case 1:
	{
		System.out.println("Thursday");
break;
	}
case 2:
	{
		System.out.println("friday");
break;
	}

case 3:
	{
		System.out.println("saturday");
break;
	}
case 4:
	{
		System.out.println("sunday");
break;
	}
case 5:
	{
		System.out.println("monday");
break;
	}
case 6:
	{
		System.out.println("tuesday");
break;
	}
default:
break;

}




System.out.println("               ");
System.out.println("");
System.out.println("");
System.out.println("");


}}
