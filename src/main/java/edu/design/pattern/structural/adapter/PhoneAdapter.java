package edu.design.pattern.structural.adapter;

public class PhoneAdapter {
	AndroidUsbCharger adaptAndroid(IPhoneCharger port) {
		AndroidUsbCharger usbPort = new AndroidUsbCharger();
		return usbPort;
	}
	IPhoneCharger adaptIphone(AndroidUsbCharger port) {
		IPhoneCharger lPort = new IPhoneCharger();
		return lPort;
	}
	static PhoneAdapter _adapter = new PhoneAdapter();
	public static PhoneAdapter getAdapter() {
		return _adapter;
	}
}
