package z_exam;

public class Exam07 {

	
	
	/*
	[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		
		자손클래스 자식에 맞게 변경해야 하는 경우가 생긴다.
		
		상속받은 내용을 재정의
		상속받은 메서드의 리턴 타입, 메서드명, 파라미터 값이 같아야 한다.
		static을 빼거나 더할 수 없다.
		
	
	[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)  
			a. 조상의 메서드와 이름이 같아야 한다.
			b. 매개변수의 수와 타입이 모두 같아야 한다.
		/	c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
		/	d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
		 	
		 	접근 제어자는 조상 메서드보다 범위가 커야한다.
		 	조상메서드 보다 많은 예외는 선언할 수 없다.
			
			
	*/
	
	//	[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하 위해서는 코드를 어떻게 바꾸어야 하는가?
		
	/*	

			class Product{
					int price; // 제품의 가격
					int bonusPoint; // 제품구매 시 제공하는 보너스점수
					 
			Product(){}
					
			Product(int price) {
					this.price = price;
					bonusPoint =(int)(price/10.0);
			}
		}
			class Tv extends Product {
				 Tv() {}
				public String toString() {
					return "Tv";
				}
		}
				//class Exercise {
					public static void main(String[] args) {
						Tv t = new Tv();
					}
			}
			
		*/	
			
			
//			Product클래스에는 이미 Product(int price)라는 
//			생성자가 정의되어 있기 때문에 컴파일러가 자동적으로 추가해 주지도 않으므로 직접
//			Product클래스에 Product(){}를 넣어주면 문제가 해결된다.
		
		//[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?
			/*
			 * 적은양의 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리 할 수 있기 때문에
			 * 코드의 추가와 변경이 용이하다.
			 * 
			 * 코드의 재사용성을 높이고 중복을 제거하여 프로그램의 생산성과 유지보수가 용이하다.
			 * 
			 */
		
		
//		[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
/*
		class Parent {
			int x=100;
			Parent() {
				this(200); //
				}
			Parent(int x) {
				this.x = x;
				}
			int getX() {
				return x;
			}
		}
		class Child extends Parent {
			
			int x = 3000;
		Child() {
			this(1000); //
		}
		Child(int x) {
			//super();
			this.x = x;
			}
		}
		class Exercise7_7 {
		public static void main(String[] args) {
			Child c = new Child();
			System.out.println("x="+c.getX());
			}
		}
		
		//Child() --Child(int x)--parent() --parent(int x)-- object()Child c


*/
/*		[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?
		//	a. public-protected-(default)-private
			b. public-(default)-protected-private
			c. (default)-public-protected-private
			d. private-protected-(default)-public
			
			접근에 제한없음-같은패키지,상속받은 클래스-같은패키지-클래스내
			
*/		
		
/*		[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		옳지 않은 것은? (모두 고르시오)
			a. 지역변수 - 값을 변경할 수 없다.
			b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
		//	c. 메서드 - 오버로딩을 할 수 없다. --	오버라이딩을 할 수 없다.
			d. 멤버변수 - 값을 변경할 수 없다.
 
*/
//		[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
//		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//		getter와 setter메서드를 추가하라.
//		
/*		
		class MyTv2 {
		boolean isPowerOn;
		int channel;
		int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		//
		public void setChannel(int channl){
			if(channl >MAX_CHANNEL || channl < MIN_CHANNEL)
				return;
			this.channel = channel;
		}
		public int getChannel(){
			return channel;
			}
		
		public void setVolume(int volume){
			if(volume > MAX_VOLUME || volume < MIN_VOLUME)
				return;
			this.volume = volume;
		}
		public int getVolume(){
			return volume;
		}
		
		//
		}
//		class Exercise7_10 {
//		public static void main(String args[]) {
//		MyTv2 t = new MyTv2();
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());
//			}
//		}
*/
	
/*		[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
		기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
		[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
		
		메서드명 : gotoPrevChannel
		기 능 : 현재 채널을 이전 채널로 변경한다.
		반환타입 : 없음
		매개변수 : 없음
*/		
		
		class MyTv2 {
			
				boolean isPowerOn;
				int channel;
				int volume;
				int prevChannel;
				
				final int MAX_VOLUME = 100;
				final int MIN_VOLUME = 0;
				final int MAX_CHANNEL = 100;
				final int MIN_CHANNEL = 1;
				
				
				//
				public void setChannel(int channl){
					if(channl >MAX_CHANNEL || channl < MIN_CHANNEL)
						return;
					prevChannel = this.channel;
					this.channel = channel;
				}
				public int getChannel(){
					return channel;
					}
				
				
				public void gotoPrevChannel() {
					setChannel(prevChannel); // 현재 체널을 이전 채널로 변경한다.
					}
				
				
				
				public void setVolume(int volume){
					if(volume > MAX_VOLUME || volume < MIN_VOLUME)
						return;
					this.volume = volume;
				}
				public int getVolume(){
					return volume;
				}
				
				
			}
		class Exercise7_11 {
		public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
			}
			}
		
		
/*		[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			o	a. public은 접근제한이 전혀 없는 접근 제어자이다.
			o	b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
			/	c. 지역변수에도 접근 제어자를 사용할 수 있다.
			o	d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
			o	e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
		
		
*/		
		
/*		[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
			클래스내에서만 접근을 제어하기 떄문에
			
			
			Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때
			문에 객체를 생성할 필요가 없기 때문
		
	*/	
		
/*		[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
				(모두 고르시오.)
				
				
				class Unit {}			//부모클래스
				class AirUnit extends Unit {}
				class GroundUnit extends Unit {}
				class Tank extends GroundUnit {}
				class AirCraft extends AirUnit {}
				Unit u = new GroundUnit();
				Tank t = new Tank();
				AirCraft ac = new AirCraft();
				
			e. t = (Tank)u; ← 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.	
				
				
			o	a. u = (Unit)ac;
			o	b. u = ac;
			o	c. GroundUnit gu = (GroundUnit)u;
			o	d. AirUnit au = ac;
			/	e. t = (Tank)u;
			o	f. GroundUnit gu = t;
			
		a. u = (Unit)ac;
		b. u = ac;
		c. GroundUnit gu = (GroundUnit)u;
		d. AirUnit au = ac;
	//	e. t = (Tank)u; ← 조상타입의 인스턴스를 자손타입으로 형변환 할 수 없다.
		f. GroundUnit gu = t;
*/		
		
/*		
		[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
		
		
				class Car {}
				class FireEngine extends Car implements Movable {}
				class Ambulance extends Car {}
				FireEngine fe = new FireEngine();
				
				
				a. fe instanceof FireEngine
				b. fe instanceof Movable
				c. fe instanceof Object
				d. fe instanceof Car
		//		e. fe instanceof Ambulance
				
				instanceof연산자는 실제 인스턴스의 모든 조상이나 구현한 인터페이스에 대해
				true를 반환한다. 그래서, 아래 그림에서 알 수 있듯이 FireEngine
				인스턴스는 Object,Car, Movable, FireEngine타입에 대해 instanceof연산을 하면 결과로 true를 얻는다. 
				어떤 타입에 대해 instanceof연산결과가 true라는 것은 그 타입으로 형변환이 가능하다는
				것을 뜻한다. 참조변수의 형변환을 하기에 앞서 instanceof연산자로 형변환이 가능한지
				미리 확인해 보는 것이 좋다.
				
				
				
*/
		
//		[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
//		클래스를 상속받도록 코드를 변경하시오.
		class Marine { // 보병
		int x, y; // 현재 위치
		void move(int x, int y) { /* 지정된 위치로 이동 */ }
		void stop() { /* 현재 위치에 정지 */ }
		void stimPack() { /* 스팀팩을 사용한다.*/}
		}
		class Tank { // 탱크
		int x, y; // 현재 위치
		void move(int x, int y) { /* 지정된 위치로 이동 */ }
		void stop() { /* 현재 위치에 정지 */ }
		void changeMode() { /* 공격모드를 변환한다. */}
		}
		class Dropship { // 수송선
		int x, y; // 현재 위치
		void move(int x, int y) { /* 지정된 위치로 이동 */ }
		void stop() { /* 현재 위치에 정지 */ }
		void load() { /* 선택된 대상을 태운다.*/ }
		void unload() { /* 선택된 대상을 내린다.*/ }
		}
		
	
		
/*		[7-20] 다음의 코드를 실행한 결과를 적으시오.
		[연습문제]/ch7/Exercise7_20.java
	*/
		class Exercise7_20 {
		public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println("c.x = " + c.x);
		c.method();
		}
		}
		class Parent {
		int x = 100;
		void method() {
		System.out.println("Parent Method");
		}
		}
		class Child extends Parent {
		int x = 200;
		void method() {
		System.out.println("Child Method");
		}
		}
		
		
		
}





















	
 