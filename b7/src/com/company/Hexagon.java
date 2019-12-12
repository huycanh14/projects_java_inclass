package com.company;

import java.util.Objects;

public class Hexagon extends Shape {
	private double side; // side of each edge
    private double rotation; // rotation from basic hexagon
    private double radius; // the distance from center to the corner
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public Hexagon (double _radius, double rotation, double side, int _positionX, int _positionY, String _color) {
        super(_positionX, _positionY, _color, "Hexagon");
        this.side = side;
        this.rotation = rotation;
        this.radius = _radius;
    }
    public boolean isHexagon() {
        return this.getShape().equals("Hexagon");
    }

    public String toString() {
        String ans = String.format("Side: %f color: %s Position(%f, %f) Rotation: %f Radius: %f", this.getSide(), super.getColor(), super.getPositionX(), super.getPositionY(), this.getRotation(), this.radius);
        ans = this.getShape() + ans;
        return ans;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return Double.compare(hexagon.side, side) == 0 &&
                Double.compare(hexagon.rotation, rotation) == 0 &&
                Double.compare(hexagon.radius, radius) == 0 && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, rotation, radius);
    }
}
