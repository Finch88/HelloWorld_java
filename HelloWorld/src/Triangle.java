// Class for triangle implementation of shape
public class Triangle extends Shape{
	
	Triangle(){
		super();
		this.setNSides(3);
	}
	Triangle(double w, double h){
		super(w, h);
		this.setNSides(3);
	}
	
	public double calcArea(){
		return 0.5*this.getWidth()*this.getHeight(); 
	}
	
	public void printSides(){
		super.printSides();
		System.out.println("A triangle always has "+this.getNSides()+" sides");
	}
}
