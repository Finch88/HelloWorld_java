// class for Square implementation of shape
// user 'extends' to inherit from a class, and 'implements' to use an iterface
public class Square extends Shape{

	// Super allows inheritance from superclass constructer
	public Square(){
		super();
		this.setNSides(4);
	}
	public Square(double w){
		super(w,w);
		this.setNSides(4);
	}
	
	public double calcArea(){
		return this.getWidth()*this.getHeight(); 
	}
	
	// Overriding method in superclass
	// A method declared final cannot be overridden
	public void printSides(){
		super.printSides();
		System.out.println("A square always has "+this.getNSides()+" sides");
	}
	
}
