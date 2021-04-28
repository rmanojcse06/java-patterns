package edu.design.pattern.structural.composite;

public class Line implements Geometry{
	Point p1;
	Point p2;
	Line(Point p1, Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	@Override
	public double slope() {
		double m = (this.p2.y-this.p1.y)/(this.p2.x-this.p1.x);
		System.out.println("\n\t********Slope of Line for (("+p1+","+p2+")) => "+m+"***********\n");
		return m;
	}
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
}
