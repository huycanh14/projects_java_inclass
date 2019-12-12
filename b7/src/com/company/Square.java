package com.company;
/*
 * Hình vuông
 */
public class Square extends Shape {
	private double side;
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

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square (double side, double x1, double y1, double x2, double y2, String _color) {
        super((x1 + x2) / 2, (y1 + y2) / 2, _color, "Square");
        this.topLeft = new Point(x1, y1);
        this.bottomRight = new Point(x2, y2);
        this.side = side;
    }
	
	public boolean isSquare() {
        return this.getShape().equals("Square");
    }

    public String toString() {
        return String.format("Side: %f color: %s Position(%d, %d)", 
        		this.getSide(), super.getColor(), super.getPositionX(), super.getPositionY());
    }
}
