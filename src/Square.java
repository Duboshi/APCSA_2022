//with Chapter 12, Shape, Circle, EquiPoly, Square

public class Square extends EquiPoly{

	//constructor
	public Square(String squareName, double sqaureSide) {
		super(squareName, 4, sqaureSide);
	}
	
	//methods
	public double area() {
		return getSide()*getSide();
	}
}
