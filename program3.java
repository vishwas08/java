
import java.util.Scanner;
class Book
{
    String name,author;
    int price,num_pages;
    Book()
    {
        name="";
        author="";
        price=0;
        num_pages=0;
    }
    void set(String n,String s,int p,int nop)
    {
        name=n;
        author=s;
        price=p;
        num_pages=nop;
    }
    void get()
    {
    	System.out.println("This class/(anything) contains name,author , price of the book ");
    }
    void ToString()
    {
         System.out.println("Name: "+name);
         System.out.println("Author: "+author);
         System.out.println("Price: "+price);
         System.out.println("No. of pages: "+num_pages);
    }


class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of books: ");
        int num=sc.nextInt();

        Book b[]=new Book[num];

        for(int i=0;i<num;i++){
            b[i]=new Book();
        }
            
        for(int i=0;i<num;i++)
        {
            System.out.println("Book "+(i+1));
            sc.nextLine();
            System.out.print("Enter the name of the Book: ");
            String n=sc.nextLine();
            System.out.print("Enter the name of the Author: ");
            String a=sc.nextLine();
            System.out.print("Enter the price of the Book: ");
            int p=sc.nextInt();
            System.out.print("Enter number of pages there in the Book: ");
            int nop=sc.nextInt();
             
            b[i].set(n,a,p,nop);
        }
        new Book().get();
        for(int i=0;i<num;i++)
        {
            System.out.println("\nDetails of book : "+(i+1));
            b[i].ToString();
        }
    }
}
}
