package f_oop2;

public class AccessModifier {
		
	public String		publicVar		="public : 접근 제한이 없음";
	protected String 	protectedVar	= "prdteced : 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String		defaultVar		= "default : 같은 패키지 에서만 접근 가능";
	private String 		PrivateVar = "private : 클래스 내에서만 접근 가능";
		

	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	public void protectedMethod(){
		System.out.println(protectedVar);
		
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	
	public void privateMethod(){
		System.out.println(PrivateVar);
	}
	
	}