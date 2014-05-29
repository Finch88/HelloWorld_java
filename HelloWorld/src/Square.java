// class for Square implementation of shape
public class Square extends Shape{

	Square(){
		this.setNSides(4);
	}
	Square(double w, double h){
		this.setWidth(w);
		this.setHeight(h);
		this.setNSides(4);
	}
	
	public double calcArea(){
		return this.getWidth()*this.getHeight(); 
	}
	
}
