package com.dy.pattern.factory.factory;

import java.util.Map;

public class HairFactory {
	public Hair getHairByClassKey(String key){
		
		try {
			Map<String, String> map = new PropertyReader().getProperties();
			String className = map.get(key);
			Hair hair = (Hair) Class.forName(className).newInstance();
			return hair;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//找不到类，抛出异常
		return null;
	}

}
