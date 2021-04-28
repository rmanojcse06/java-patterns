package edu.design.pattern.structural.composite;

import java.util.Arrays;
import java.util.List;

public class CompositeMain {
	public static void main(String[] args) {
		List<Geometry> list = Arrays.asList(
									new Point(1,2),
									new Line(new Point(2,3), new Point(4,6)),
									new Square(
											new Line(new Point(24,6),new Point(12,3)),
											new Line(new Point(12,3),new Point(14,15)),
											new Line(new Point(14,15),new Point(26,18)),
											new Line(new Point(26,18),new Point(24,6))
									),
									new Triangle(
											new Line(new Point(2,4),new Point(5,4)),
											new Line(new Point(5,4),new Point(4,7)),
											new Line(new Point(4,7),new Point(2,4))
									)
								);
		
		
		list.stream().forEach(g->System.out.println("Slope of g =>"+g.slope()+"\t"+g));
		
		
	}
}
