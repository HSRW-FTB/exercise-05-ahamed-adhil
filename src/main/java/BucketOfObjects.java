 class BucketOfObjects {

		private GeometricObject[] items=new GeometricObject[7];
		private int i=0;
		
		
		public BucketOfObjects() {
			
			
		}
		
		public void addObject(GeometricObject go) {
			
			if(i<items.length) {
				
				items[i]=go;
				i++;
			}
			
			
		}
		
		public double getTotalArea() {
			
			double t=0;
			
			for(int i=0;i<items.length;i++) {
				
				t=t+items[i].getArea();	
				
			}
			
			return t;
		}
		
		public double getTotalPerimeter() {
			
			double t=0;
			
			for(int i=0;i<items.length;i++) {
				
				t=t+items[i].getPerimeter();	
				
			}
			
			return t;
			
		}

		public String toString() {
			
			String a="";		
			for(int i=0;i<items.length;i++) {
			
		
				
				a=a+items[i].getClass().getName()+",";
				
			}
			
			return a;
		
		
	}
}
