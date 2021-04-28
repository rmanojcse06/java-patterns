package edu.design.pattern.structural.bridge;

public class BridgeMain {
	public static void main(String[] args) {
		// delegator which abstracts different class
		Remote r = new Remote();
		r.makeCall("81223-XXXX");
		r.changeVolume(29);
	}
}
