package circleApplication;

public class Circle {
	
	private double radius;
	private double area;
	
	public Circle()
	{
		radius=1;
	}
	public double calculateArea(double r)
	{
		int x;
		area=Math.PI*Math.pow(r,2);
		return area;
	}
		

}
