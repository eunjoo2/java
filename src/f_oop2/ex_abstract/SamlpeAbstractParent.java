package f_oop2.ex_abstract;

public abstract class SamlpeAbstractParent {
		
	/*
	 * <<추상 메서드>>
	 * - 구현부가 없이 선언부만 존재하는 메서드이다.
	 * - abstract 리턴타입 메서드명();
	 * - 클래스 구현에 도움을 주기 위해 사용한다.
	 * 
	 * <<추상 클래스>>
	 * - 추상메서드를 가진 클래스를 추상 클래스 라고 한다.
	 * - abstract class 클래스명{}
	 * - 추상 클래스는 객체를 생성할 수 없고, 부모 클래스의 역할만 할수있다.
	 */
	
	
	
	void method(){
		
	};
	//추상 메서드
	abstract void abstractMethod();
}

class SampleAbstractChild extends SamlpeAbstractParent { 
	
	//추상메서드를 상속 받으면 반드시 구현해야 한다.
	//상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야한다.
	@Override
	void abstractMethod() {
		
	}
	
}