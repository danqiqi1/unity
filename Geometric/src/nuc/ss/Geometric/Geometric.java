package nuc.ss.Geometric;
import java.time.LocalDate;
import java.util.Date;
public class Geometric 
{
	protected String color;
	protected boolean filled;
	protected LocalDate date;
	public Geometric() {}
	public Geometric(String color, boolean filled) 
	{
		super();
		this.color = color;
		this.filled = filled;
		this.date = LocalDate.now();
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public float getArea() 
	{
		return 0;
	}
	public float getPerimeter()
	{
		return 0;
	}
	public float getDiameter()
	{
		return 0;
	}
	
}