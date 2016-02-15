package com.dy.pattern.factory.abstractFactory;

public class PersonTest {
	public static void main(String[] args) {
		PersonFactory mcFactory = new MCFactory();
		PersonFactory hnfaFactory = new HNFactory();
		
		MCBoy mcBoy = (MCBoy) mcFactory.getBoy();
		mcBoy.drawBoy();
		
		MCGirl mcGirl = (MCGirl) mcFactory.getGirl();
		mcGirl.drawGirl();
		
		HNBoy hnBoy = (HNBoy) hnfaFactory.getBoy();
		hnBoy.drawBoy();
		
		HNGirl hnGirl = (HNGirl) hnfaFactory.getGirl();
		hnGirl.drawGirl();
	}

}
