package z_exam;

public class Exam02 {

	/*[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
	크 기
	종 류
	1 byte 2 byte 4 byte 8 byte
	논리형 1.boolean
	문자형		2.char	
	정수형1.byte 2.short 3.int 4.long
	실수형			3.float 4.double
	*/
	
	/*[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
	(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
	초기화 하는 한 줄의 코드를 적으시오.
	long = _long
	_long regNo = 9502112360314L;
	
	
	*/
	/*[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
	int i = 100;
	long l =100L;
	final float PI = 3.14f;
	
	- 리터럴 : 100; 100L; 3.14f;
	- 변수 :i l
	- 키워드 : int long final float
	- 상수 : PI
	*/
	/*[2-4] 다음 중 기본형(primitive type)이 아닌 것은? b
	a. int
	b. Byte
	c. double
	d. boolean
	앞글자가 대문자는 class
	*/
	
	/*[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
	류’라고 적으시오.
	System.out.println(“1” + “2”) → (12)
	System.out.println(true + “”) → (true)
	System.out.println(‘A' + 'B') → (131)
	System.out.println('1' + 2) → (51)
	System.out.println('1' + '2') → (99 )
	System.out.println('J' + “ava”) → (Java )
	System.out.println(true + null) → (오류 )
	6 Java의 정석定石 3판 - 연습문제 풀이
	*/
	/*[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오) b.c.d.e
	a. if
	b. True
	c. NULL
	d. Class
	e. System
	*/
	/*[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)a.d.e.g.
	a. $ystem
	b. channel#5  특수문자#혀용안됨
	c. 7eleven  숫자가 앞으로 와서 안됨
	d. If
	e. 자바
	f. new 예약어
	g. $MAX_NUM
	h. hello@com
	*/
	/*[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
	르시오) a.d- 4byte
	a. int
	b. long 8
	c. short 2
	d. float
	e. double 1
	
	*/
	/*[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오) d,e
	byte b = 10;
	char ch = 'A'; 
	int i = 100;
	long l = 1000L;
	
	a. b = (byte)i;
	b. ch = (char)b;
	c. short s = (short)ch;
	d. float f = (float)l;
	e. i = (int)ch;
	*/ 
	
	d. float f = (float)l; // float(4byte)의 범위가 int(4byte)보다 커서 생략가능
	e. i = (int)ch; // char(2 byte) → int(4byte)이므로 생략가능
	
	
	/*[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
	 * 
	 0~2^16-1(0~65535)
	 
	Java의 정석定石 3판 - 연습문제 풀이 7
	*/
	
	/*[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오) a,b,c,d
	a. byte b = 256; (-128~127)를 넘는 값으로 초기화 할 수 없음
	b. char c = ''; 반드시 하나의 문자를 설정해야 함
	c. char answer = 'no'; ah 에서는 하나의 문자는 설정 할수 있음
	d. float f = 3.14  접미사필요
	e. double d = 1.4e3f;
	*/
	a. (-128~127)를 넘는 값으로 초기화 할 수 없음 오버플로우
	b. 반드시 하나의 문자를 설정해야 함
	c. ch에서는 하나의 문자는 설정 할수 있음
	d. f 접미사필요
	
	/*[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오) a,b,c,e
	a. public static void main(String[] args)
	b. public static void main(String args[])
	c. public static void main(String[] arv) arv는 다른 단어로 표기 가능
	d. public void static main(String[] args)
	e. static public void main(String[] args) static정적매서드 를 의미 public 인공  바뀌어도 된다
	*/
	
	/*[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오) c,e,f
	a. boolean - false
	b. char - '\u0000'
	c. float - 0.0 	0.0f가 기본값 	d가 생략
	d. int - 0
	e. long - 0			L접미사 생략
	f. String - ""		참조형은 null이 기본값
*/
	
<<<<<<< Updated upstream
	//집에서 한 작업
=======
	
>>>>>>> Stashed changes
}/*
*/

