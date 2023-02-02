import java.util.*;
import java.util.Scanner;
class student
{
 double sgpa;
 int marks,credit;
 String name,usn;
 void assign(String str,String usn1 )
 {
 name=str;
 usn=usn1;
 }
 int grade(int a)
 {
 if(a==100)
 return 10;
 return (a/10)+1;
 }
 void display()
 {
 System.out.println("name of the student is "+ name);
 System.out.println("Usn is "+usn);
 System.out.println("SGPA is "+sgpa);
 }
}
class sgpa
{
 public static void main(String args[])
 {
 int sum=0,credsum=0;
 String sname,susn;
 Scanner sc=new Scanner(System.in);
 student s=new student();
 System.out.println("enter student name and usn respectively");
 sname=sc.nextLine();
 susn=sc.nextLine();
 s.assign(sname,susn);
 for(int i=0;i<5;i++)
 {
 System.out.println("enter marks and credit of subject "+ i+1 +" respectively");
 s.marks=sc.nextInt();
 s.credit=sc.nextInt();
 sum+=(s.grade(s.marks)*s.credit);
 credsum+=s.credit;
 }
 s.sgpa=(double)sum/credsum;
 s.display();
 }
} 