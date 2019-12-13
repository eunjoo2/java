package e_oop;

public class ClassMaker {
		// 전역 변수 하나를 선언 및 초기화 해주세요.
	
		String name =	"은주";
		
		//리턴타입과 파라미터가 없는 매서드 하나를 만들어 주세요
		//매서드 안에서 전역변수를 출력해 주세요
		void method1(){
			System.out.println(name);
		}
		//전역변수와 동일한 타입의 리턴타입이 있고 파라미터가 없는 매서드 하나를 만들어 주세요.
		//매서드 안에서 전역변수를 리턴해 주세요/
		String method2(){
			return name;
		}
		//리턴타입은 없고 파라미터가 하나 있는 메서드
		//메서드 안에서 파라미터를 출력해 주세요
		void method3(String 사탕){
			System.out.println(사탕);
		}
		//int타입의 리턴타입과 int 타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요
		//메서드 안에서 두파라미터를 곱한 결과를 리턴 해주세요
		int multiply(int a,int b){
			return a * b;
		}
		
		//
		
		
		
}

