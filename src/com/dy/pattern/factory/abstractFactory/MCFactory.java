package com.dy.pattern.factory.abstractFactory;

public class MCFactory implements PersonFactory{

	@Override
	public Girl getGirl() {
		return new MCGirl();
	}

	@Override
	public Boy getBoy() {
		return new MCBoy();
	}

}
