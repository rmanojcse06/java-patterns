package edu.design.pattern.structural.adapter;

public class AdapterMain {
	public static void main(String[] args) {
		Android android = new Android();
		IPhoneCharger iPhoneCharger = new IPhoneCharger();
		
		android.recharge(PhoneAdapter.getAdapter().adaptAndroid(iPhoneCharger));
	}
}
