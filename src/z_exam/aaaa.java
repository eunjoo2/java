package z_exam;

public class aaaa {


	public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch + 32) : ch;
																// ( /* (1) */ ) ? ( /* (2) */ ) : ch
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
		// b =('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z');
		
	}	
}
	
