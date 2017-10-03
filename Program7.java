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