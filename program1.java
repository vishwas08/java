import java.util.*;
public class quadeqn
{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 double a,b,c,D;
 System.out.println("Enter the values of coefficients");
 a=sc.nextDouble();
 b=sc.nextDouble();
 c=sc.nextDouble();
 D=(b*b-4*a*c);

 double r1,r2;
 if(a!=0)
 {
 if(D>0)
 {
 r1=(-b + Math.sqrt(D))/(2*a);
 r2=(-b - Math.sqrt(D))/(2*a);
 System.out.println("Distinct and roots are :"+ " "+r1+ " "+r2);
 }
 else if(D<0)
 {
 System.out.println("Roots are imaginary ");
 }
 else
 {
 r1=r2=(-b/(2*a));
 System.out.println("equal roots are :"+" "+r1+ " "+r2);
 }
 }
}
}