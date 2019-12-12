package com.company;

import java.util.ArrayList;

public class Layer {
	private ArrayList<Shape> shapeList;
	private boolean visible = true;
	public boolean canBeDrawn() {
        return this.visible;
    }
    public void setCanBeDrawn(boolean ok) {
        this.visible = ok;
    }
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
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
	 
	 public void deleteDuplicate() {
	        int n = this.shapeList.size();

	        ArrayList<Boolean> deleted = new ArrayList<>();
	        for (int i = 0; i < n; i++) deleted.add(false);

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (this.shapeList.get(i).isSameShape(this.shapeList.get(j))) {
	                    if (this.shapeList.get(i).equals(this.shapeList.get(j))) {
	                        deleted.set(j, true);
	                    }
	                }
	            }
	        }

	        for (int j = n - 1; j >= 0; j--) {
	            if (deleted.get(j)) {
	                this.shapeList.remove(j);
	            }
	        }
	    }
}
