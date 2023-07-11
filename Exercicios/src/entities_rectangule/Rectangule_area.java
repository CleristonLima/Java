package entities_rectangule;

public class Rectangule_area {
	
	public double width;
	public double height;
	
	public double areaRectangular() {
		
		return width * height;
		
	}
	
	public double perimeterRectangular() {
		
		return  2 * (height + width);
	
	}
	
	public double diagonalRectagular() {
		
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
	}
	
}
