package edu.kh.poly.ex1.model.service;

import javax.swing.text.Caret;

import edu.kh.poly.ex1.model.vo.Car;
import edu.kh.poly.ex1.model.vo.Spark;
import edu.kh.poly.ex1.model.vo.Tesla;

public class PolyService {

	public void ex1() {
		
		// 다형성 확인 예제
		
		// Car 객체 생성 
		Car car = new Car(); // 부모 타입 참조변수 = 부모 객체 
		
		// Tesla 객체 생성
		Tesla tesla = new Tesla(); // 자식 타입 참조변수 = 자식 객체
		
		
		// ********************** 다형성 **************************
		Car car2 = new Tesla(); // 부모타입 참조변수 = 자식 객체 생성 
								// 테슬라 객체가 부모타입으로 변함. 
								// ==> Tesla 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
								// Tesla 객체가 Car(부모) 객체로 변화함. 
		
		Car car3 = new Spark();  
					
		// ***************** 다형성(업캐스팅) 작성방법 *****************
		// 1) 자식 객체가 부모 객체로 변하였기 때문에 
		//    자식만의 고유한 필드, 메소드를 사용할 수 없다.
		
		//  1-1) car ( 부모 = 부모 )
		car.setEngine("v6 6기통 엔진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car 메소드 모두 사용가능( 자기꺼라서 )
		
		// 1-2) tesla (자식 = 자식)
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(10000000);
		// Tesla 메소드 모두 사용가능
		
		// 1-3) car2 (부모 = 자식(Tesla))
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
//		car2.setBatteryCapacity(10000000);  // car 타입에 존재하지 않음. 즉, 자식의 메소드 사용하지 못함.
		 									// Tesla 자체의 (자식 : 자신)은 가져올 수 없음. 
											// ==> 자식이 부모님꺼를 가져오면 내꺼는 사용하지 못함. 
		
		car3.setEngine("경차 엔진");
		car3.setFuel("휘발류");
		car3.setWheel(4);
//		car3.setdiscountOffer(1012032109);  // car타입을 하기 때문에 자기 자신거는 사용하지 못함. 
			
		
	}
	
	
	
	

}
