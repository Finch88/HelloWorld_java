// abstract class for shape
abstract public class Shape {
	
	private int nSides;
	private double width;
	private double height;
	
	public int getNSides(){ return this.nSides; }
	public void setNSides(int n){ this.nSides=n; }
	
	public double getWidth(){ return this.width; }
	public void setWidth(double w){ this.width=w; }
	
	public double getHeight(){ return this.height; }
	public void setHeight(double h){ this.height=h; }
	
	abstract public double calcArea();
}
