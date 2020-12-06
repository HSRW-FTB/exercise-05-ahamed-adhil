 abstract class Circle extends GeometricObject {
	double radius;
	int numberofobjects;
	
	Circle(){
		numberofobjects++;
		
		
	}
	Circle (double newradius){
		
		radius=newradius;
	}
 public double getArea() {
	return radius*radius*Math.PI ;
	
}
 public double getPerimeter() {
	 return 2*radius*Math.PI ;
 }
 public void printCircle() {
	 System.out.println("i am a Circle with Radius"+ radius+ " , perimeter"+ getPerimeter()+ "and Area" + this.getArea());
 }
 public String  toString() {
	 return "The Radius of the Circle " + radius ;
 }
 
}
