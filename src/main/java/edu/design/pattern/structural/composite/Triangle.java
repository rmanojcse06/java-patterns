package edu.design.pattern.structural.composite;

import java.util.Arrays;

public class Triangle implements Geometry{
	Line[] lines;
	Triangle(Line a, Line b, Line c){
		this.lines = new Line[] {a,b,c};
	}
	@Override
	public double slope() {
		return Arrays.asList(this.lines)
								.stream()
								.reduce(0.0d,							// identity
										(d,line)->d+line.slope(),		// accumulator
										Double::sum);					// combiner
		
	}
	@Override
	public String toString() {
		return "Triangle [lines=" + Arrays.toString(lines) + "]";
	}
	
}
