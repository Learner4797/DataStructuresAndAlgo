package abstraction;
abstract class Shape{
	int l = 10;
	int b = 20;
	int r = 14;
	int s = 12;
	abstract void area();
}
class Rectangle extends Shape{
	void area(){
		System.out.println("The area of rectangle is: "+l*b);
	}
}
class Square extends Shape{
	void area(){
		System.out.println("The area of square is: "+s*s);
	}
}
class Circle extends Shape{
	void area(){
		System.out.println("The area of circle is: "+(3.14)*r*r);
	}
}

public class Shapes {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.area();
		Shape square = new Square();
		square.area();
		Shape rectangle = new Rectangle();
		rectangle.area();

	}

}
