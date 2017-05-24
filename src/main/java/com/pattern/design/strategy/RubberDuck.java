package com.pattern.design.strategy;

import com.pattern.design.strategy.impl.FlyNoWay;
import com.pattern.design.strategy.superfclass.Duck;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我全身发黄，嘴巴很红");
	}
	
	
	public void quack(){
		System.out.println("嘎~嘎~嘎~");
	}



}
