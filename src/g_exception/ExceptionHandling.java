package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*
		 * <<에러>>
		 * - 컴파일 에러 : 컴파일 시에 발생되는 에러(빨간줄)
		 * - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 거 (버그)
		 * - 런타임 에러 : 실행 시에 발생되는 에러 (우리가 처리할 에러)
		 * 
		 * <<런타임 에러>>
		 * - 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류(처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리가능)
		 * 
		 * << 예외 >>
		 * - 모든 예외는 Exception 클래스의 자식 클래스 이다.
		 * - RuntimeExceptiion 클래스와 그 자식들은 예외처리가 강제 처리 되지 않는다.(unchecked)
		 * - [RuntimeExceptiion 클래스와 그 자식들을 제외한] Exception 클래스의 자식들
		 * 	 예외처리가 강제된다(checked 예외
		 * 
		 * << 예외 처리(try-catch) >>
		 * - 예외 처리를 통해 프로그램이 비정상적으로 종료 되는것을 방지할 수 있다.
		 * - try {실행하고 싶은 } catch (Exception e) {}
		 * - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어 간다.
		 * - catch의 ()안에는 처리할 예외를 지정해 줄수 있다.
		 * - 여러종류의 예회를 처리할 수 있도록 catch 하나이상 올수 있다
		 * - 발생한 예외와 일치하는 catch 블럭안의 내용이 수정된 후 try-catch 를 빠져 나간다.
		 * - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
		
		try{
		int result = 10/0;// 예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		System.out.println(result); // 예외 발생시 실행되지 않는다.
		} catch(ArithmeticException |IndexOutOfBoundsException e){
			//예외 발생시 발생한 예외와 일치하는 catch블럭이 수행되고
			//일치하는 catch가 없는 경우 예외는 처리되지않는다.
			e.printStackTrace();
		} catch(NullPointerException e){
			//여러종류의 예외를 처리하기 위해 catch를 하나 이상 사용할 수 있다.
		} catch(Exception e){
			//예상치 못한 예외를 처리할 수 있다.
			//모든 예외를 한번에 처리할 수 있다.
		}
		
		test1();
	}

	private static void test1() {
		test2();
	}
	
	private static void test2(){
	//System.out.println(10/0);
		try{
		new FileInputStream("");
	} catch (FileNotFoundException e){
	 e.printStackTrace();	
	}
	
}
}