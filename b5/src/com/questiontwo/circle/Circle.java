package com.questiontwo.circle;

import com.questiontwo.Shape;

public class Circle extends Shape {
	private double radius = 1.0;
	private final double PI = Math.PI;

	public double getPI() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		
	}
	
	public Circle(double _radius) {
		this.radius = _radius;
	}
	
	public Circle(double _radius, String _color, boolean _filled) {
		super(_color, _filled);
		this.radius = _radius;
	}
	
	public double getArea() {
		/*
		 * P = r * r * pi;
		 * Tính diện tích
		 */
		return Math.pow(this.getRadius(), 2) * this.getPI();
	}
	
	public double getPerimeter() {
		/*
		 * C = 2 * r * pi
		 * Tính chu vi
		 */
		return 2 * this.getRadius() * this.getPI();
	}
	
	public String toString() {
		return String.format("Radius: %f\nArea: %f\nPerimeter: %f\nColor: %s\nFilled: %b\n", 
				this.getRadius(), this.getArea(), this.getPerimeter(), super.getColor(), super.isFilled());
	}
}
