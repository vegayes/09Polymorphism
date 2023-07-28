package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
//		Animal an = new Animal(); // Cannot instantiate the type Animal (객체화 할 수 없음)
		
		// 클래스 : 객체의 속성, 기능을 정의한 것 ( 일종의 설계도 )
		// 추상 클래스 : 미완성 메서드를 포함한 클래스 ( 미완성 설계도 )
		// ---> 미완성 설계도로 객체를 만들 수 없다! :: 오류발생 
		
		
		// 해결 방법 ! 
		// => Animal을 상속받아 미완성 부분을 구현한 클래스를 이용해 객체 생성
		
		Person p1 = new Person();
		
		//본인 필드에 넣기
		p1.setName("홍길동");
		
		//상속받은 기능 호출
		p1.setType("척추동물");
		p1.setEatType("잡식");
		
		//오버라이딩한 메소드 호출
		System.out.println(p1.toString());
		p1.eat();
		p1.breath();
		p1.move();
		
		System.out.println("-".repeat(30));
		
		Fish f1 = new Fish();
		f1.eat();
		f1.breath();
		
		
	}
	
	
	public void ex2() {
		
		// * 추상 클래스와 다형성  +  바인딩
		
		// - 추상클래스는 객체로 만들 수 없다!
		// ==> 하지만, "참조 변수(->타입)"로는 사용할 수 있다!
		
		// 사람 ->동물   / 물고기 -> 동물
		
//		Animal a1 = new Aniaml();// (X)
//		Animal a1 = new Person(); // (0)
//		Animal a2 = new Fish(); // (0)

		
		Animal[] arr=  new Animal[2]; // 참조 변수 타입으로 만들 수 있음.
		
		arr[0] = new Person("사람", "잡식", "김사람");
		// Animal 부모 = Person 자식(다형성 중 업캐스팅)

		arr[1] = new Fish("물고기", "잡식");
		// Animal 부모 = Fish 자식(다형성 중 업캐스팅)
		
		
		//바인딩 확인
		for(int i = 0 ; i < arr.length; i++) {
			// arr[i] == Animal 참조변수
			
			System.out.println(arr[i].toString());
			arr[i].eat();  // 정적 바인딩 :: Anmail에서 옴.
			arr[i].breath();
			//void edu.kh.poly.ex2.model.vo.Animal.eat()
			
			//실제 프로그래밍 실행 시, 
			// 참조하고 있는 자식 객체의 오버라이딩된 eat()메소드 수행한다. :: 동적 바인딩
			// --> 부모 타입 참조 변수로 메소드를 호출했지만
			//     자식 타입에 오버라이딩된 메소드가 수행된다.
			System.out.println("=".repeat(50));
		}
		
		
		
		
	}
	
	
	
	
	

}
