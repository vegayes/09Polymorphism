package edu.kh.poly.ex1.run;

import edu.kh.poly.ex1.model.service.PolyService;

public class PolyRun {
	
	public static void main(String[] args) {
		
		PolyService service = new PolyService();
		
//		service.ex1();
//		service.ex2();
//		service.ex3();
//		service.ex4();
		service.ex5();  // 정적 바인딩 ( 프로그램 실행 전에 알려줌.. :: 정적으로 알려줌 ) 
		
		
		
	}
	
	

}
