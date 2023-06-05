package com.oops2;

interface Shapes {
	double getArea();
	double getperimeter();
}
class Circle implements Shapes{
	float radius;
	public Circle(float radius) {
		this.radius = radius;
	}
	public double getArea() {
		return (Math.PI*radius*radius);
	}
	public double getPerimeter() {
		return(2*Math.PI*radius);
	}
	@Override
	public double getperimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Rectangle implements Shapes {
	float length ,breadth;
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
public double getArea() {
	return(length*breadth);
}
public class Interface {

}
@Override
public double getperimeter() {
	// TODO Auto-generated method stub
	return 0;
}}
