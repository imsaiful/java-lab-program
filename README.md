# java-lab-program
All the java lab program of AIACTR 5 sem
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


Program 5:
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
 
 
 
