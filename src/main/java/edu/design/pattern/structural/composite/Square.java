package edu.design.pattern.structural.composite;

import java.util.Arrays;

public class Square implements Geometry{
	Line[] lines;
	Square(Line a, Line b, Line c, Line d){
		this.lines = new Line[] {a,b,c,d};
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
		return "Square [lines=" + Arrays.toString(lines) + "]";
	}
	
}
