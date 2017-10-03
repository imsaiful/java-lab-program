import java.util.*;
class MyException extends Exception {
   int s1;
   MyException(int s2) {
      s1 = s2;
   } 
   @Override
   public String toString() { 
      return ("Sorry Your age="+s1+"       { Age<18 are not allowed.}");
   }
}
public class Program9 { 
   public static void main(String args[]) { 
      Scanner in=new Scanner(System.in);
      System.out.println("Enter your age");
      int x=in.nextInt();
      try
      {
         if(x<18) 
         {
            throw new MyException(x);
         }
      else
      {
         System.out.println("Welcome to EVM");
      }
      }
      catch(MyException e)
      {
         System.out.println(e);
      }
   }
}