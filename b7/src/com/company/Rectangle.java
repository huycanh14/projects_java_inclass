package com.company;

/*
 * Hình chữ nhật
 */
public class Rectangle extends Shape {
	private double length, width;
	private Point topLeft, bottomRight;

	public Point getTopLeft() {
		return topLeft;
	}

	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}

	public Point getBottomRight() {
		return bottomRight;
	}

	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Rectangle (double length, double width, double x1, double y1, double x2, double y2, String _color) {
        super((x1 + x2) / 2, (y1 + y2) / 2, _color, "Rectangle");
        this.length = length;
        this.width = width;
        this.topLeft = new Point(x1, y1);
        this.bottomRight = new Point(x2, y2);
    }

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
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
