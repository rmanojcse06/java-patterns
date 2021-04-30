package edu.design.pattern.structural.decorator;

public  class LogClassDecorator extends SimpleLogger{
	private SimpleLogger d;
	private Class c;
	public LogClassDecorator(SimpleLogger data, Class clazz) {
		this.d = data;
		this.c = clazz;
	}
	@Override
	public void log(String message) {
		d.log("["+(this.c!=null?this.c:"")+"] - "+message);
	}
}
