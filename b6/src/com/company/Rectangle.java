package com.company;

/*
 * Hình chữ nhật
 */
public class Rectangle extends Shape {
	private int length, width;

	public Rectangle(int length, int width, double _positionX, double _positionY, String _color) {
		super(_positionX, _positionY, _color, "Rectangle");
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public boolean isRectangle() {
        return this.getShape().equals("Rectangle");
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public String toString() {
        return String.format("length: %d width: %d color: %s position(%d %d) Area: %f", 
        		this.getLength(), this.getWidth(), super.getColor(), super.getPositionX(), super.getPositionY(), this.getArea());
    }
}
