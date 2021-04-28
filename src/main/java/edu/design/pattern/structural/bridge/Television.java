package edu.design.pattern.structural.bridge;

public class Television implements Device{
	void changeVolume(int count) {
		System.out.println("Television:changeVolume => "+count);
	}
	void changeChannel(int channel) {
		System.out.println("Television:changeChannel => "+channel);
	}
	@Override
	public void powerOff() {
		System.out.println("Television:powerOff");
	}
	@Override
	public void powerOn() {
		System.out.println("Television:powerOn");
	}
}
