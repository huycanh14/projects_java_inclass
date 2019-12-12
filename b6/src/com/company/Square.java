package com.company;
/*
 * Hình vuông
 */
public class Square extends Shape {
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side, double _positionX, double _positionY, String _color) {
		super(_positionX, _positionY, _color, "Square");
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
