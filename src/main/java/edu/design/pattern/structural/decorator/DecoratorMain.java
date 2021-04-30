package edu.design.pattern.structural.decorator;

public class DecoratorMain {
public static void main(String[] args) {
	SimpleLogger logger = new LogDateDecorator(new LogClassDecorator(new SimpleLogger(), DecoratorMain.class));
	logger.log("Hello This is from Decorator");
}
}
