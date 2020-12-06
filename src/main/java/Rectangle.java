 class  Rectangle extends GeometricObject{
  
  double width = 1;
  double height = 1;
  String Colour ;
  
   Rectangle(){
  
  }
  
  Rectangle(double newWidth, double newHeight){
  
    width = newWidth;
    height = newHeight;
  
  }
 
 public double getArea(){
  
    return (width*height);
    
  }
  
  public double getPerimeter(){
  
    return (2*(width+height));
    
  }
   public void  changeColour(String newColour) {
	   this.Colour=newColour;
	   
   }

}