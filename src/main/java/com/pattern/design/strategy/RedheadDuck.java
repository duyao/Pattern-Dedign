package com.pattern.design.strategy;

import com.pattern.design.strategy.impl.FlyWithWin;
import com.pattern.design.strategy.superfclass.Duck;


public class RedheadDuck extends Duck {

	public RedheadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
