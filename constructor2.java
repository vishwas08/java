//constructor
//volume java
class box

{
   double length;
   double breadth;
   double height;
   public box(double a, double b, double c)
{
length=a;
breadth=b;
height=c;
}
   
   double Vol()
   {
   return length*breadth*height;
    }
}
 public class constructor2
{
   public static void main(String[] args)
   {
   box mybox1=new box(20,30,10);
   box mybox2=new box(10,10,10);
   box mybox3=new box(20,20,20);
   System.out.println(mybox1.Vol());
   System.out.println(mybox2.Vol());
   System.out.println(mybox3.Vol()); 
   }
}