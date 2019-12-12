package com.company;

public class Circle extends Shape {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle (int _radius, int _positionX, int _positionY, String _color) {
        super(_positionX, _positionY, _color, "Circle");
        this.radius = _radius;
    }

    public void moveTo(double x, double y) {
        super.moveTo(x, y);
    }

    public boolean isCircle() {
        return this.getShape().equals("Circle");
    }
    
    public double getArea() {
        return this.getRadius() * this.getRadius() * 3.14;
    }
    
    public String toString() {
        return String.format("Radius: %d Position: (%f, %f) color: %s Area: %f", 
        		this.getRadius(), super.getPositionX(), super.getPositionY(), super.getColor(), this.getArea());
    }
}
