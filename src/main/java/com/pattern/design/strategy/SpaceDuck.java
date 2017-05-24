package com.pattern.design.strategy;

import com.pattern.design.strategy.impl.FlyWithRocket;
import com.pattern.design.strategy.superfclass.Duck;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println("��ͷ���ͷ��");
	}
	
	public void quack(){
		System.out.println("��ͨ�����ߵ�����ͨ��");
	}

}
