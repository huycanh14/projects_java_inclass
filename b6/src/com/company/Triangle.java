package com.company;

/*
 * Hình tam giác
 */
public class Triangle extends Shape {
	private int a, b, c;
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideC() {
		return sideC;
	}
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	private double sideA, sideB, sideC;

    Point point1;
    Point point2;
    Point point3;
    
    public boolean isTriangle() {
        return this.getShape().equals("Triangle");
    }
    
    public Triangle (int x1, int y1, int x2, int y2, int x3, int y3, String _color) {
        super((double)(x1 + x2 + x3) / 3, (double)(y1 + y2 + y3) / 3, _color, "Triangle");
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        this.sideA = point1.dist(point2);
        this.sideB = point2.dist(point3);
        this.sideC = point3.dist(point1);
    }

    public void moveTo(double x, double y) {
        double dX = x - super.getPositionX();
        double dY = y - super.getPositionY();
        this.point1.setX(this.point1.getX() + dX);
        this.point1.setY(this.point1.getY() + dY);

        this.point2.setX(this.point2.getX() + dX);
        this.point2.setY(this.point2.getY() + dY);

        this.point3.setX(this.point3.getX() + dX);
        this.point3.setY(this.point3.getY() + dY);
        super.moveTo(x, y);
    }
    
    public String toString() {
        return String.format("Side1: %f Side2: %f Side3: %f Trong tam: (%f, %f)", 
        		this.getSideA(), this.getSideB(), this.getSideC(), super.getPositionX(), super.getPositionY());
    }
}
