package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * << OOP(Object Oriented Programming) :객체지향 프로그래밍>>
		 * -프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것.
		 * -코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체생성(인스턴스화)>>
		 * - 클래스를 사용하기 위해 메모리(heap영역)에 올려놓은 것
		 * - new 클래스명();선언 -> 객체가 저장된 메모리 주소 반환.
		 * - 객체 뒤에 참조연산자(.) 를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		 * - 객체는 생성될때 마다 새로룬 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		SampleClass sc = new SampleClass(); // 메모리에 올려주면서  객체 생성을 해준 걸 (sc)변수에 주소를 저장.
		
		sc.method1(); //객체를 저장한 (클래스로)주소에가서 실행을 하고 돌아와
		
		sc.method2(5);
		
		String returnString = sc.method3();
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);
		System.out.println(returnInt);
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요
		
		sc.test1();
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		
		ClassMaker cm = new ClassMaker();
		
		//객체가 저장된 변수를 통해 메서드들을 호출해 주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고, 리턴타입이 있는 메서드는 리턴받은 값을 출력해 주세요
		
		cm.method1();
	
		
		String method2 = cm.method2();
		System.out.println(method2);
		
		cm.method3("사탕");
		
		int multiply1 = cm.multiply(2, 8);
		System.out.println(multiply1);
		
		
		//다음을 한줄씩으로 계산해서 최종 결과값을 출력해 주세요.
		Calculator cl =new Calculator();
		
		double a1 = cl.plus(123456,654321);
		System.out.println(a1);
		
		double a2 = cl.multiply(a1, 123456);
		System.out.println(a2);
		
		double a3 = cl.division(a2, 123456);
		System.out.println(a3);
		
		double a4 = cl.minus(a3, 654321);
		System.out.println(a4);
		
		double a5 = cl.qt(a4, 123456);
		System.out.println(a5);
	}

}
