class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double l = (side1 + side2 + side3) / 2;
		return Math.sqrt(l * (l - side1) * (l - side2) * (l - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}
