package com.company;

public class Shape {
	private double positionX;
	private double positionY;
	private String color;
	private String shape;
	
	public double getPositionX() {
		return positionX;
	}
	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}
	public double getPositionY() {
		return positionY;
	}
	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public Shape(double _positionX, double _positionY, String _color, String _shape) {
		this.positionX = _positionX;
		this.positionY = _positionY;
		this.color = _color;
		this.shape = _shape;
	}
	
	public void moveTo(int x, int y) {
		this.setPositionX(x);
		this.setPositionY(y);
	}
	
	public void moveTo(double x, double y) {
		this.setPositionX(x);
		this.setPositionY(y);
	}
	
	public boolean isTriangle() {return false;}
    public boolean isRectangle() {return false;}
    public boolean isSquare() {return false;}
    public boolean isCircle() {return false;}
}
