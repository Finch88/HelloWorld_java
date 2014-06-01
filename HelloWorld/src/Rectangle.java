// Rectangle implementation of shape
public class Rectangle extends Shape{
	// Super allows inheritance from superclass constructer
	public Rectangle(){
		super();
		this.setNSides(4);
	}
	public Rectangle(double w, double h){
		super(w,h);
		this.setNSides(4);
	}
	
	public double calcArea(){
		return this.getWidth()*this.getHeight(); 
	}
	
	// Overriding method in superclass
	// A method declared final cannot be overridden
	public void printSides(){
		super.printSides();
		System.out.println("A rectangle always has "+this.getNSides()+" sides");
	}

}
