package nuc.ss.Geometric;
import java.util.Scanner;
public class Circle extends Geometric
{
	private float r;
	public Circle(String color, boolean filled)
	{
		super(color,filled);
		Scanner sc = new Scanner(System.in);
		this.r = sc.nextFloat();
		sc.close();
	}
	public float getArea()
	{
		return 3.14f * r * r;
	}
	public float getPerimeter()
	{
		return 3.14f * r * 2;
	}
	public float getDiameter()
	{
		return r * 2;
	}
	
	
}
	
