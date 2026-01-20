package circle;

public class Circle {
	static double PI = 3.14;
	double radius;
	
	public double circumferenceOfCircle() {
		return 2*PI*radius;
	}
	
	public double areaofCircle() {
		return PI*radius*radius;
	}
	
	public double diameter() {
		return 2*radius;
	}
	
	public void initializeValue(double r) {
		radius=r;
	}
	
	public String display() {
		return "Radius : " + radius + "cm" + "\nCircumference Of the Circle :" +
				circumferenceOfCircle() + "cm"	+ "\nArea of the Circle : " + areaofCircle() + "sq.cm"
				+ "\nDiameter of the circle : " + diameter() + "cm";
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.initializeValue(10);
		System.out.println(circle.display());
	

	}

}
