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
 public class volume
{
   public static void main(String[] args)
   {
   box mybox=new box();
   System.out.println(mybox.Vol());
   }
}