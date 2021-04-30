package edu.design.pattern.structural.decorator;

import java.text.SimpleDateFormat;

public class LogDateDecorator extends SimpleLogger {
	private SimpleLogger d;
	private final SimpleDateFormat f;
	public LogDateDecorator(SimpleLogger data) {
		this.d = data;
		this.f = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss,SSS");
	}
	@Override
	public void log(String message) {
		d.log(f.format(System.currentTimeMillis())+" :: "+message);
	}
}
