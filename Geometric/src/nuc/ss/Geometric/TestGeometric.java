package nuc.ss.Geometric;

public class TestGeometric {
	public static void main(String[] args)
	{
		Geometric geo = new Circle("黑白色" , true);
		System.out.println(geo.getColor());
		System.out.println(geo.filled);
		System.out.println(geo.getDate());
		System.out.println(geo.getArea());
		System.out.println(geo.getPerimeter());
		System.out.println(geo.getDiameter());
	}
}
