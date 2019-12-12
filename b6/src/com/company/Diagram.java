package com.company;

import java.util.ArrayList;

public class Diagram {
	private ArrayList<Layer> layerList;

	public ArrayList<Layer> getLayerList() {
		return layerList;
	}

	public void setLayerList(ArrayList<Layer> layerList) {
		this.layerList = layerList;
	}
	
	public Diagram() {
		this.layerList = new ArrayList<Layer>();
	}
	
	public void addLayer(Layer myLayer) {
        this.layerList.add(myLayer);
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
}
