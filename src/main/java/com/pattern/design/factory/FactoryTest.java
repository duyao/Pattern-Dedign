package com.pattern.design.factory;

public class FactoryTest {

	public static void main(String[] args){
		
//		HairInterface left = new LeftHair();
//		left.draw();
		
		HairFactory factory = new HairFactory();
//		HairInterface right =  factory.getHair("right");
//		right.draw();
		
//		HairInterface left = factory.getHairByClass("com.sunny.project.LeftHair");
//		left.draw();
		
//		HairInterface hair = factory.getHairByClassKey("in");
//		hair.draw();
		
//		PersonFactory facoty = new MCFctory();
//		Girl girl = facoty.getGirl();
//		girl.drawWomen();
		
		PersonFactory facoty = new HNFactory();
		Boy boy =  facoty.getBoy();
		boy.drawMan();
	}
}
