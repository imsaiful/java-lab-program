import java.io.*;
import java.util.*;
class M
{  
 void method()throws IOException
 {  
 throw new IOException("device error");  
 }  
}  
class Program10
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);System.out.println("Enter two number");
int a=in.nextInt();
int b=in.nextInt();
try
{
int d=a/b;
System.out.println("Division is="+d);
}
catch(ArithmeticException e)
{
System.out.println("int number can noy be divide by zero");
System.out.println(e);
}
finally
{
System.out.println("finally block is executed");
}
 try{  
     M m=new M();  
     m.method();  
    }
    catch(Exception e)
    {
    	System.out.println("exception handled");
    }     
  
    System.out.println("normal flow...");  
}
}