package com.company;

import java.util.ArrayList;

public class Layer {
	private ArrayList<Shape> shapeList;

	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	public Layer() {
        this.shapeList = new ArrayList<>();
    }
	
	public void addShape(Shape shapeNew) {
        this.shapeList.add(shapeNew);
    }
	
	 public void deleteTriangle() {
        for (int i = this.shapeList.size() - 1; i >= 0; i--) {
            if (this.shapeList.get(i).isTriangle()) {
                this.shapeList.remove(i);
            }
        }
    }
	 
	 public void deleteCircle() {
        for (int i = this.shapeList.size() - 1; i >= 0; i--) {
            if (this.shapeList.get(i).isCircle()) {
                this.shapeList.remove(i);
            }
        }
    }
	 
	 public String toString() {
        String ans = "";
        for (Shape shape: this.shapeList) {
            ans += String.format("Shape: %s Color: %s Position: (%f, %f) \n", 
            		shape.getShape(), shape.getColor(), shape.getPositionX(), shape.getPositionY());
        }
        return ans;
    }
}
