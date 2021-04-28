package edu.design.pattern.structural.bridge;

public class Telephone implements Device{
	void call(String phoneNumber) {
		System.out.println("Telephone:calling to "+phoneNumber);
	}
	void message(String phoneNumber) {
		System.out.println("Telephone:calling to "+phoneNumber);
	}
	@Override
	public void powerOff() {
		System.out.println("Telephone:powerOff");
	}
	@Override
	public void powerOn() {
		System.out.println("Telephone:powerOn");
	}
}
