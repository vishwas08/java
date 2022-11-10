//constructor
//volume java
class box
{
   double length=10.0;
   double breadth=20.0;
   double height=30.0;

   
   double Vol()
   {
   return length*breadth*height;
    }
}
 public class constructor1
{
   public static void main(String[] args)
   {
   box mybox1=new box();
   box mybox2=new box();
   box mybox3=new box();
   System.out.println(mybox1.Vol());
   System.out.println(mybox2.Vol());
   System.out.println(mybox3.Vol()); 
   }
}