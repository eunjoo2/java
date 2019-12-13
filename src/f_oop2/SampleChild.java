package f_oop2;

public class SampleChild extends SampleParent {
		//아무것도 상속받지 않는 클래스는 /*extends Object*/ 를 상속받고 있었다.
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		
		int result = method(7,13);
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) {
			SampleChild sc = new SampleChild();
			System.out.println(sc.var);
			
			int result = sc.method(7,13);
			System.out.println(result);
			
			sc.test(10);
			
			SampleParent sp = new SampleChild();
			//부모타입이 가지고 있는 멤버만 사용 할 수 있다.
			System.out.println("sp.var :" + sp.var);
			System.out.println("sc.var :" + sc.var);
			System.out.println("sp.method() : " + sp.method(5, 10));
			System.out.println("sc.method() : " + sc.method(5, 10));
//			sp.childMerhod();
//			sp.test(); 
			
	}
			
	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는 것.
//	@Override // 어노테이션
	int method(int a, int b){//리턴타입 메서드명 파라미터 모두 같아야 한다.
		return a * b;
	}
	
	int var;
	
	void test (double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스변수
		System.out.println(super.var);//상속받은  인스턴스 변수
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));
		System.out.println(super.method(10, 20));
	}
	
	SampleChild(){
		super(); //자식 클래스 메서드안에 반드시 있어야 한다.
		//super()를 사용해 부모클래스의 객체도 생성한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
		
	
	
}
	



