import java.util.Scanner;
abstract class Shape{
int a,b;
Shape(int x,int y)
{
a=x;
b=y;
}
abstract void printArea();
}
class rectangle extends Shape{
rectangle(int x,int y)
{
super(x,y);
}
void printArea()
{
System.out.println("Area of rectangle ="+(a*b));
}
}
class triangle extends Shape{
triangle(int x,int y)
{
super(x,y);
}
void printArea()
{
System.out.println("Area of triangle ="+ (0.5*a*b));
}
}
class circle extends Shape{
circle(int x)
{
super(x,x);
}
void printArea()
{
System.out.println("Area of circle ="+ (3.14*a*a));
}
}
class week4{
public static void main(String args[])
{
Shape s;
rectangle r1=new rectangle(20,40);
triangle t1=new triangle(20,30);
circle c1=new circle(20);
s=r1;
s.printArea();
s=t1;
s.printArea();
s=c1;
s.printArea();
}
}