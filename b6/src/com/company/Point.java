package com.company;
import static java.lang.Math.sqrt;

public class Point {
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dist(Point _p) {
        return sqrt((this.x - _p.getX()) * (this.x - _p.getX()) + (this.y - _p.getY()) * (this.y - _p.getY()));
    }
}
