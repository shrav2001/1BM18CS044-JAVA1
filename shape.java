import java.util.*;
abstract class Shape
{
	int x,y;
	abstract void printArea();
}
class Rectangle extends Shape
{
	Rectangle()
	{
		System.out.println("enter length and breadth");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of rectangle="+(x*y));
	}
}
class Triangle extends Shape
{
	Triangle()
	{
		System.out.println("enter base and height");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void printArea()
	{
		System.out.println("Area of triangle="+(0.5*x*y));
	}
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("enter radius");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
	}
	void printArea()
	{
		System.out.println("Area of circle="+(3.141*x*x));
	}
}
class ShapeDemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Shape ref=null;
		System.out.println("enter 1 for rectangle,2 for triangle and 3 for circle -1 to exit");
		int ch=s.nextInt();
		while(ch!=-1)
		{
		switch(ch)
		{
			case 1:ref=new Rectangle();
				break;
			case 2:ref=new Triangle();
				break;
			case 3:ref=new Circle();
				break;
			default:System.out.println("invalid input");
		}
		ref.printArea();
		System.out.println("enter 1 for rectangle,2 for triangle and 3 for circle -1 to exit");
		
		ch=s.nextInt();
		}
	}
}
