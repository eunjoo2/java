package e_oop;

public class ClassMaker2 {
		
		public static void main(String[] args) {
			ClassMaker2 cm = new ClassMaker2();
				
			System.out.println(cm.oop);
			
				
			
		}
	
		//전역변수 하나를 선언하고 명시적 초기화 해주세요.
		
		int oop = 10;
		
		//위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요
		{
			oop = 20;
		}
		
		//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요
		
		ClassMaker2(int oop){
			
				this.oop= oop;
			}
		
		//위에서 선언한 전역변수를 하나더 만들어서 초기화 해주세요
	
		ClassMaker2(){
				this(30);
			}
		

}
