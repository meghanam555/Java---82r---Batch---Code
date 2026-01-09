package javabatch;

public class Rectangle {
	int length;
	int breadth;
	
	public int Perimeter() {
		return  2*(length+breadth);
	}
	public int Area() {
		return length*breadth;
	}
	public void initializingValue(int l, int b) {
		length = l;
		breadth = b;
	}
	public String result() {
		return "Length : " + length  + "\nBreadth :" + breadth + "\nPerimeter of the Rectangle :" + Perimeter() + "\nArea of the Rectangle : " + Area() ;
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.initializingValue(20, 10);
		System.out.println(r1.result());

	}

}
