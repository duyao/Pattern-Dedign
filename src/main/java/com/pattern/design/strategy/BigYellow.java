package com.pattern.design.strategy;

import com.pattern.design.strategy.impl.FlyNoWay;
import com.pattern.design.strategy.superfclass.Duck;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我身体很大，全身黄黄");
	}

}
