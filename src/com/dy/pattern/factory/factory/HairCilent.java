package com.dy.pattern.factory.factory;

public class HairCilent {
	
	public static void main(String[] args) {
		HairFactory hairFactory = new HairFactory();
		
		
		LeftHair leftHair = (LeftHair) hairFactory.getHairByClassKey("left");
		leftHair.draw();
		
		InHair inHair = (InHair) hairFactory.getHairByClassKey("in");
		inHair.draw();
		
		
	}

}
