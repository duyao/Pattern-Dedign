package com.pattern.design.factory;
/**
 * �����ʵ�ֽӿ�
 * @author Administrator
 *
 */
public interface PersonFactory {

	//�к��ӿ�
	public Boy getBoy();
	//Ů���ӿ�
	public Girl getGirl();
	
}
