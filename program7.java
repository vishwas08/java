import java.lang.*;
import java.util.Scanner;

class WrongAge extends Exception
{
	private String detail;
	WrongAge(String a)
	{
		detail=a;
	}
	public String toString() 
	{
		return("WrongAge Exception ["+detail+ "]");
	}
}

class Father {
	int f_age;
	Father(int a) throws Exception
	{
		f_age=a;
		if(f_age<0)
		{
			throw new WrongAge("Father's age is negative");
		}
		
	}
	void display()
	{
		System.out.println("Father's age: "+f_age);
	}
}

class Son extends Father
{
	int s_age;
	Son(int ag,int f) throws Exception
	{
		super(f);
		s_age=ag;
		if(s_age<0)
		{
			throw new WrongAge("Son's age is negative");
		}	
		if(s_age>=f_age)
		{
			throw new WrongAge("Son's age greater than father's age");
		}
	}
	void display()
	{
		System.out.println("Son's age: "+s_age+" Father's age: "+f_age);
	}
}

class program7
{
	public static void main(String args[]) throws Exception
	{
		int ch,f,s;
		Scanner sc= new Scanner(System.in);
		try
		{
		while(true){
			System.out.println("1.Check Father\n2.Check Son and Father's age\n3.Exit\nEnter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter father's age");
					f=sc.nextInt();
					Father f1=new Father(f);
					f1.display();
					break;
				case 2:
					System.out.println("Enter son and father's age");
					s=sc.nextInt();
					f=sc.nextInt();
					Son s1=new Son(s,f);
					s1.display();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid choice");
			}
		}
		}
		catch(WrongAge e)
		{
			System.out.println("Exception: "+e);
		}
	}
}