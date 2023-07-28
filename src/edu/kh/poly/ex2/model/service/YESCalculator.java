package edu.kh.poly.ex2.model.service;

public class YESCalculator /* extends Animal*/ implements Calculator{  // interface를 상속 받을 때, implements 사용!
	// +) 클래스, 인터페이스 동시 상속 가능
	// 인터페이스는 다중 상속 가능
	
	// extends : 확장하다, implements : 구현하다.
	// (부) 클래스 - (자) 클래스 : extends( 추상클래스 포함 ) 
	// (부) 인터페이스 - (자) 클래스 상속 시, implements   ( 협업때 사용! 
	// (부) 인터페이스 - (자) 인터페이스 상속 시는? 
	
	// 미완성 메소드 :: 강제 오버라이딩
	@Override
	public int plus(int num, int num2) {
		return num + num2;
	}

	@Override
	public int minus(int num, int num2) {
		return num - num2;
	}

	@Override
	public int multiple(int num, int num2) {
		return num * num2;
	}

	@Override
	public int divide(int num, int num2) {
		return num / num2;
	} 

	
}
