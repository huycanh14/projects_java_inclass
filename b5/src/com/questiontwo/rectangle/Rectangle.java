package com.questiontwo.rectangle;

import com.questiontwo.Shape;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Rectangle() {
		
	}
	
	public Rectangle(double _width, double _length) {
		this.width = _width;
		this.length = _length;
	}
	
	public Rectangle(double _width, double _length, String _color, boolean _filled) {
		super(_color, _filled);
		this.width = _width;
		this.length = _length;
	}
	
	public double getArea() {
		/*
		 * S = width * length
		 */
		return this.getWidth() * this.getLength();
	}
	
	public double getPerimeter() {
		 /*
		  * P = 2 * (width + length)
		  */
		return 2 *  (this.getWidth() + this.getLength());
	}
	
	public String toString() {
        return String.format("Width: %f\nlength: %f\nArea: %f\nPerimeter: %f\nColor: %s\nFilled: %b\n", 
        		this.getWidth(), this.getLength(), this.getArea(), this.getPerimeter(), super.getColor(), super.isFilled());
    }
}
