import java.util.*;
class j
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
Scanner s=new Scanner(System.in);
int regno,o,t,th,f,fi;
float x;
String name;
System.out.println("");
System.out.println("------------input-----------");


System.out.println("Enter the regno : ");
regno=scan.nextInt();

System.out.println("Enter the name : ");
name=s.nextLine();

System.out.println("Enter the 1st mark : ");
o=scan.nextInt();
System.out.println("Enter the 2nd mark: ");
t=scan.nextInt();
System.out.println("Enter the 3rd mark : ");
th=scan.nextInt();
System.out.println("Enter the 4th mark : ");
f=scan.nextInt();
System.out.println("Enter the 5th mark : ");
fi=scan.nextInt();


x=(o+t+th+f+fi)/5;


System.out.println("------------output-----------");
if(o>=50 && t>=50 && th>=50 && f>=50 && fi>=50)
{
		if(x>=90 &&x<=100)
{
System.out.println("S");
}
else if(x>=80)
{
System.out.println("A");
}
else if(x>=70)
{
System.out.println("B");
}
else if(x>=60)
{
System.out.println("C");
}
else if(x>=50)
{
System.out.println("D");
}

else
{
	System.out.println("E");
	
}



}
else
System.out.println("Not eligibile");






System.out.println("               ");
System.out.println("");
System.out.println("");
System.out.println("");


}}






