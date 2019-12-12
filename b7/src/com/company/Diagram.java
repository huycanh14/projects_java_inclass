package com.company;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layerList;
	private ArrayList<Layer> shapeLayers;

	public ArrayList<Layer> getLayerList() {
		return layerList;
	}

	public void setLayerList(ArrayList<Layer> layerList) {
		this.layerList = layerList;
	}
	
	public ArrayList<Layer> getShapeLayers() {
        return shapeLayers;
    }
	
	 public void setShapeLayers(ArrayList<Layer> shapeLayers) {
	        this.shapeLayers = shapeLayers;
    }

	
	public Diagram() {
		this.layerList = new ArrayList<Layer>();
	}
	
	public void addLayer(Layer myLayer) {
		if(myLayer.isVisible() == true) {
			this.layerList.add(myLayer);
		}
    }
	
	public void deleteCircle() {
        for (Layer layer: this.layerList) {
            layer.deleteCircle();
        }
    }
	
	public String toString() {
        String ans = "";
        for (Layer layer: this.layerList) {
            ans = ans + layer.toString() + "\n";
        }
        return ans;
    }
	public void addShapeToLayer() {
        for (int i = 0; i < 5; i++) this.shapeLayers.add(new Layer());
        for (Layer layer : this.layerList) {
            ArrayList<Shape> list = layer.getShapeList();
            for (Shape shape : list) {
                if (shape.isSquare()) {
                    this.shapeLayers.get(0).addShape(shape);
                } else if (shape.isRectangle()) {
                    this.shapeLayers.get(1).addShape(shape);
                } else if (shape.isCircle()) {
                    this.shapeLayers.get(2).addShape(shape);
                } else if (shape.isTriangle()) {
                    this.shapeLayers.get(3).addShape(shape);
                } else if (shape.isHexagon()) {
                    this.shapeLayers.get(4).addShape(shape);
                }
            }
        }
    }
}
