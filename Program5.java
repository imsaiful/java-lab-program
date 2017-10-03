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