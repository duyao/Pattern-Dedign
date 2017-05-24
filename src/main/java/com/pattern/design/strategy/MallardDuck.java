package com.pattern.design.strategy;

import com.pattern.design.strategy.impl.FlyWithWin;
import com.pattern.design.strategy.superfclass.Duck;


public class MallardDuck extends Duck {

	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}
