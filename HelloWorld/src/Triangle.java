// Class for triangle implementation of shape
public class Triangle extends Shape{
	
	Triangle(){
		this.setNSides(4);
	}
	Triangle(double w, double h){
		this.setWidth(w);
		this.setHeight(h);
		this.setNSides(4);
	}
	
	public double calcArea(){
		return 0.5*this.getWidth()*this.getHeight(); 
	}
}
