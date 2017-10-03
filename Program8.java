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