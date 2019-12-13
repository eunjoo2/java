package z_exam;

public class Exam03 {

	public static void main(String[] args) {
	
		[3-2]
				
		int numOfApples = 123; 	//사과의 개수 
		int sizeOfBucket = 10; 	//바구니의 크기 (바구니에 담을 수 있는 사과의 개수) 
		int numOfBucket = (); 	//모든 사과를 담는데 필요한 바구니의 수
		
		System.out.println("필요한 바구니의 수 :" +numOfBucket);
		
		// ((numOfApples +9) / sizeOfBucket )
 		
		[3-3]
		//양수, 음수, 0 ? :
				
		int num = 10;
		System.out.println( num ==10 ? "양수" : (num == 10 ? "음수" : "0"));
				
		//( num ==10 ? "양수" : (num == 10 ? "음수" : "0"))	
		
		
		
		
		[3-4]
				
		int num = 456; 
		
		System.out.println(( num / 100)* 100 );
		
		//(( num / 100)* 100 )
		
		[3-5]
		int num = 333; 
		System.out.println(num / 10 * 10); 
	
		//	(num / 10 * 10) 33을 먼저 만들어 주고 10을 곱해	330을 만들어 준다
					
		[3-6]
		int num = 24; 
		System.out.println();
		
		//
		
		[3-7]
		int fahrenheit = 100;
		float celcius = ( /* (1) */ );
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		//(5 / 9 *(fahrenheit - 32))...
		
		[3-8]
	

				
		
		[3-9]
		char ch = 'z'; 
		boolean b = ('a' <= ch && ch <= 'z')||('A' <= ch && ch <= 'Z'); 
		
		System.out.println(b);
		// b =('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
		
		[3-10]
				
		char ch = 'A';
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
															// ( /* (1) */ ) ? ( /* (2) */ ) : ch
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
				
		// b =('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
		//int 형식이라 char 타입으로 형변화를 해줘야 함
	
				
				
				
				
				
				
	}
	

}
