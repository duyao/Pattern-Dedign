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
		System.out.println("��ȫ���ƣ���ͺܺ�");
	}
	
	
	public void quack(){
		System.out.println("��~��~��~");
	}



}
