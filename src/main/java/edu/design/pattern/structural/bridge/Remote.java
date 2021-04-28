package edu.design.pattern.structural.bridge;

public class Remote {
	Telephone telephone;
	Television television;
	public Remote() {
		telephone = new Telephone();
		television = new Television();
	}
	void changeChannel(int channel) {
		television.changeChannel(channel);
	}
	void changeVolume(int count) {
		television.changeVolume(count);
	}
	void makeCall(String phoneNumber) {
		telephone.call(phoneNumber);
	}
	void sendSms(String phoneNumber) {
		telephone.message(phoneNumber);
	}
}
