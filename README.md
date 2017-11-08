# java-lab-program
All java lab program of AIACTR 5 sem
AIM:
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/WhatsApp%20Image%202017-10-03%20at%2023.24.37.jpeg)
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/WhatsApp%20Image%202017-11-03%20at%2010.17.46%20PM.jpeg)

Program 1:
```
class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
	}
}
```
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-03%2023-40-59.png)

Program 2:
```
import java.util.*;
class Program2
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first Number");
		int a=in.nextInt();
		System.out.println("Enter the Second Number");
		int b=in.nextInt();
		int s=a+b;
		System.out.println(a+"+"+b+"="+s);
	}
}

```
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-03%2023-53-39.png)

Program 3:

```
class Program3
{
	public static void main(String[] args)
	{
		int x=010;
		int y=06;
		int z=x+y;
		int a=0x010;
		int b=0x6;
		int c=a+b;
		System.out.println("Octal Addition="+z);
		System.out.println("Hexa Addition="+c);
}
}
```
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2001-08-37.png)
Program 4:
```
class Program4
{
	public static void main(String[] args)
	{
		String first[]={"Lion ","Crow " , "Fish "};
		String middle[]={"lives in ","is fly in ","lives inside "};
		String last[]={"Jungle.","sky. ","water."};
		for(int i=0;i<3;i++)
		{
			System.out.print(first[i]+middle[i]+last[i]);
			System.out.println();
		}

	}
}
```
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2000-26-18.png)
#Program 5
```
import java.util.*;
class Program5
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Random ran=new Random();
		int x=ran.nextInt(10);
		System.out.println(x);
		int flag=0;
	    boolean guess=false;
		while(!guess)
		{
			flag++;
			System.out.println("Guess the number between 1 to 9");
			int y=in.nextInt();
			if(x==y)
			{
				System.out.println("Correct Guess in "+flag+" try");
				break;
			}
			else
			{
				System.out.println("Wrong Guess. Please try Again");

			}
       }
	}
}
```
![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2001-23-37.png)

Program 6:
```
Program 5:Shuffle the cards
import java.util.*;
class Cards
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String card[][]={{"spades of A", "heart of A", "diamond of A", "Club of A"},
						{"spades of 2", "heart of 2", "diamond of 2", "Club of 2"},
						{"spades of 3", "heart of 3", "diamond of 3", "Club of 3"},
						{"spades of 4", "heart of 4", "diamond of 4", "Club of 4"},
						{"spades of 5", "heart of 5", "diamond of 5", "Club of 5"},
						{"spades of 6", "heart of 6", "diamond of 6", "Club of 6"},
						{"spades of 7", "heart of 7", "diamond of 7", "Club of 7"},
						{"spades of 8", "heart of 8", "diamond of 8", "Club of 8"},
						{"spades of 9", "heart of 9", "diamond of 9", "Club of 9"},
						{"spades of 10", "heart of 10", "diamond of 10", "Club of 10"},
						{"spades of J", "heart of J", "diamond of J", "Club of J"},
						{"spades of Q", "heart of Q", "diamond of Q", "Club of Q"},
						{"spades of K", "heart of K", "diamond of K", "Club of K"}};
		Random r1=new Random();
		Random r2=new Random();
		 for (int i = 12; i >0; i--) {
    		for(int j=3;j>0;j--)
    		{
                        int x=r1.nextInt(i);
    			int y=r2.nextInt(j);
    			System.out.println(x);
            	String temp = card[i][j];
            	card[i][j]= card[x][y];
            	card[x][y]= temp;
		}         
            
        }
		for(int i=0;i<13;i++)
		{
			System.out.println("Player "+(i+1)+" Cards");
			for(int j=0;j<4;j++)
			{
				System.out.print(card[i][j]+"                ");
			}
			System.out.println();
			System.out.println();
		}
		}
}
```
 ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/cards)
 
 Program 7:
 ```
 import java.util.*;
class Circle
{
	protected int r;
	protected final double pi=3.14;
	Circle(int r)
	{
		this.r=r;
	}
}
class Area extends Circle
{
	Area(int r)
	{
	super(r);
	}
	public void Show()
	{
		double a=3.14*r*r;
		System.out.println("Area ="+a);
	}
}
class Perimeter extends Circle
{
	Perimeter(int r)
	{
	super(r);
	}
	public void Show()
	{
		double p=2*pi*r;
		System.out.println("Perimeter ="+p);
	}
}
class Program7
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=in.nextInt();
		Area a=new Area(r);
		Perimeter p=new Perimeter(r);
		a.Show();
		p.Show();

	}
}
 ```
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2002-17-33.png)
  Program 8:
  
  ```
import java.util.*;
interface Shape
{
	void input();
	void area();
	void volume();
	void show();
}
class Disk implements Shape
{
	int r, h;
	public final double pi=3.14;
	public void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter circle Radius");
		r=in.nextInt();
		System.out.println("Enter circle Height");
		h=in.nextInt();
	}
	public void show()
	{
		System.out.println("Radius="+r);
		System.out.println("Height="+h);
	}
	public void area()
	{
		double area=2*pi*r*(r+h);
		System.out.println("Area="+area);
	}
	public void volume()
	{
		double volume=pi*r*r*h;
		System.out.println("Volume="+volume);
	}
} 
class Program8
{
	public static void main(String[] args)
	{
		Disk d=new Disk();
		d.input();
		d.show();
		d.area();
		d.volume();
	}
}
  
  
  ```
  
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2002-45-09.png)
Program 9:
```
import java.util.*;
class MyException extends Exception {
   int s1;
   MyException(int s2) {
      s1 = s2;
   } 
   @Override
   public String toString() { 
      return ("Sorry Your age="+s1+" Age<18 are not allowed.");
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

```
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2003-17-50.png)

Program 10
```
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

```

  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/Screenshot%20from%202017-10-04%2003-37-05.png)
 
 
 
 Program 14:Write a program to demonstrate wait and notify for the Multithreading in Java
 ```
 import java.util.*;
class Atm
{
	static int  balance=1000;
	synchronized void Withdraw(int money)
	{
		System.out.println("Processing");
		if((balance-money)<0)
		{
			System.out.println("Insufficient balance");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
			balance=balance-money;
			System.out.println("Withdraw Complete. Remaining Balance="+balance);
		
	}
	synchronized void deposit(int money)
	{
		balance=balance+money;
		System.out.println(money+" deposit succesfully");
		notify();
	}
}
class Interthread 
{
	public static void main(String[] args)
	{
		
		final Atm a=new Atm();
		new Thread(){  
						public void run(){
							
							a.Withdraw(1500);}  
					}.start();  
		new Thread(){  
						public void run(){
							a.deposit(1500);}  
					}.start(); 
	}
}
 ```

  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/multi.png)
 
 
 Program 15: Write a program to implement synchronizing
 ```
 class Synch
{
	 synchronized void print(int n)
	 {
	 	
	 	for(int i=1;i<=n;i++)
	 	{
	 		try
	 	{
	 		Thread.sleep(500);	
	 	}
	 	catch(Exception e)
	 	{
	 		System.out.println(e);
	 	}
	 		System.out.println(n*i);
	 	}
	 	
	 	
	 }
public static void main(String[] args)
{
	final Synch s=new Synch();
	Thread t1=new Thread()
	{
		public void run()
		{
			s.print(8);
		}
	};
	Thread t2=new Thread(){
		public void run()
		{
			s.print(9);
		}
	};
	t1.start();
	t2.start();
}
}
 ```
 
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/sy.png)
  
  
  Program 19.1 : ArrayList
  
  ```
  import java.util.*;
class ArrayListExample
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("Enter the Number of  Elements");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			a.add(x);
		}
		System.out.println();
		System.out.print("Elements Are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println(" ");
		System.out.print("Sorted Elements Are:");
		Collections.sort(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println(" ");
		System.out.println("List Size is="+ a.size());
		System.out.println("Lasgest Element is="+ a.get(a.size()-1));
	
	}

}

```

  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/array.png)
  
  Program 19.2 HashSet
  ```
  import java.util.*;
class SetExample
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		HashSet<Integer> a = new HashSet<Integer>();
		System.out.println("Enter the Number of  Elements");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			a.add(x);
		}
		System.out.print("\nElements are ");
		Iterator itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println("\nEnter the element to remove");
		int x=in.nextInt();
		a.remove(x);

		System.out.print("\n "+x+" remove.\nNew set elements are  ");
		itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		}
}
```
   
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/set.png)
  
  Program 20: HashMap
  
```
import java.util.*;
class TreeSetExample
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		System.out.println("Enter the Number of  Elements");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("ENter the subject Code");
			int x=in.nextInt();
			System.out.println("ENter the subject Name");
			String y=in.next();
			hm.put(x,y);
			
		}
		  for(Map.Entry m:hm.entrySet()){  
   		  System.out.println(m.getKey()+" "+m.getValue());  
	}
}
}
```
  ![alt text](https://github.com/imsaiful/java-lab-program/blob/master/hm.png)

