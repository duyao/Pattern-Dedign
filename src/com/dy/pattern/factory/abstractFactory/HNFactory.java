package com.dy.pattern.factory.abstractFactory;

public class HNFactory implements PersonFactory {

	@Override
	public Girl getGirl() {
		return new HNGirl();
	}

	@Override
	public Boy getBoy() {
		return new HNBoy();
	}

}
