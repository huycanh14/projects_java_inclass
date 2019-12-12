package com.questiontwo.rectangle.square;

import com.questiontwo.rectangle.Rectangle;

public class Square extends Rectangle {
	
	public  Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String _color, boolean _filled) {
		super(side, side, _color, _filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	public void setLength(double side) {
        super.setLength(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public String toString() {
    	return String.format("Side: %f\nArea: %f\nPerimeter: %f\nColor: %s\nFilled: %b\n", 
    			this.getSide(), this.getArea(), this.getPerimeter(), super.getColor(), super.isFilled());
    }
}
