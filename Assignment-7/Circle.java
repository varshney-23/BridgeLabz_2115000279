import java.util.*;

public class Circle {
	double radius;
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;	
	}
	
	double CircleArea() {
		return 3.14 * radius * radius;
	}
	
	double CircleCircumference() {
		return 2 * 3.14 * radius;
	}
	
	void display() {
		System.out.println("Radius -> " + radius);
		System.out.println("Area -> " + CircleArea());
		System.out.println("Circumference -> " + CircleCircumference());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double rad = sc.nextDouble();
		Circle cir = new Circle(rad);
		cir.display();
		sc.close();
	}
}
