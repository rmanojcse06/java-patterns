package edu.design.pattern.structural.composite;

public class Point implements Geometry{
	double x,y;
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	@Override
	public double slope() {
		return 0;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
