package edu.kh.poly.ex2.model.vo;

public class Person extends Animal{
	// 상속만 받은 경우 오류남 
	// Cannot instantiate the type Animal 
	// => 이유) 추상 클래스의 메서드를 오버라이딩 안했기 때문에  
	
	private String name;
	
	// 생성자 
	public Person() {};
		
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}



	// getter , setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {		
		return "Person : "+ super.toString() + " / " + name;
	}
	
	// 강제 오버라이딩 해야 할 것 ! 
	@Override
	public void eat() {
		
		System.out.println("숟가락, 젓가락 등 도구를 이용해서 먹는다.");
		
	}

	@Override
	public void breath() {
		
		System.out.println("코와 입으로 숨쉰다.");
		
	}

	@Override
	public void move() {
		
		System.out.println("두발로 걷는다.");
			
	}

	
		
}
