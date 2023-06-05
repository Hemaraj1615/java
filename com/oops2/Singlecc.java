package com.oops2;
//base class circle
class Circle {
private double radius = 1.0d;
private String color = "red";
public Circle (double radius , String color) {
	super ();
	this.radius = radius;
	this.color = color ;
}
 public double getradius() {
	 return radius ;
	 
 }
  public void setradius( double radius) {
	  this.radius = radius;
  }
  public String getcolor( ) {
	  return color ;
  }

   public  void setcolor ( String color) {
      this.color = color ;
   }
 @Override
public String toString() {
	return "Circle [radius=" + radius + ", color=" + color + "]";
}
 
 public double getArea() {
	 System.out.println(" color of the circle :" + color);
	 System.out.println( "Radius of the circle :" + radius);
	 return ( Math.PI*(Math.pow(radius, 2)));
 }
 }
  class Cylinder extends Circle{
	  public Cylinder() {
		  super();
	  }
       public Clyinder ( double radius) {
    	   super (radius);
       }
       public Cylinder (double radius ,double height) {
    	   super(radius);
    	   this.height = height;
       }
       private double height = 1.0;
       public Cylinder( double radius , double height , String color) {
    	   super(radius,color);
    	   this.height = height ;
       }
        public double getheight() {
        	return height ;
        }
         public void setheight( double height) {
        	 this.height = height;
         }
        public double getvolume() {
        	return getArea()*height;
        	}  
        
  
@Override
		public String toString() {
			return "Cylinder [height=" + height + "]";
		}
  }

class Singlecc {
	public static void main(String[] args) {
		
		Cylinder c1 = new Cylinder(2,3,3,5);
  System.out.println("Radius :" + c1.getradius());
  System.out.println("color :" + c1.getradius());
  System.out.println(c1);
  System.out.println("volume of the Cylinder" + c1.getvolume());
  
	 Cylinder c2 = new Cylinder(5,2,4, 5,"white");
	 System.out.println("Radius :" + c2.getradius());
	 System.out.println("color:" + c2.getcolor());
	 System.out.println(c2);
	 System.out.println("volume of the Cylinder" + c2.getvolume());
	}
}
