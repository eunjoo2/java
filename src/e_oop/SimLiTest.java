package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		new SimLiTest().question1();
	}

	Scanner scanner = new Scanner(System.in);
	
	void question1(){
		System.out.println("너의 연애 유형은? 질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("나는 금방 사랑에 빠진다.");
		
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			 question2();
		}else{
			 question4();
		}
	
	}
	void question2(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("연애할 때 끌려다니는 타입이다.");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question5();
		}else{
			question3();
		}
	}
	void question3(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("데이트 코스는 미리 짜는게 편하다.");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question6();
		}else{
			question5();
		}
	}
	void question4(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("감정기복이 크지 않다.");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question7();
		}else{
			question5();
		}
	}
	
	void question5(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("감정표현에 솔직한 편이다.");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question8();
		}else{
			question6();
		}
	}
	void question6(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("활동적인 데이트가 좋다");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question8();
		}else{
			question9();
		}
	}
	
	void question7(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("연락이 없이도 믿고 기다리는 편이다");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			typeA();
		}else{
			question8();
		}
	}
	void question8(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("이성친구는 존재할 수 없다");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			question9();
		}else{
			typeB();
		}
	}
	void question9(){
		System.out.println("질문을 듣고'y'or 'n'으로 대답해 주세요");
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		String answer = scanner.nextLine();
		if(answer.equals("y")){
			typeD();
		}else{
			typeC();
		}
	}
	void typeA(){
		System.out.println("A타입");
		System.out.println("서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
	}
	void typeB(){
		System.out.println("B타입");
		System.out.println("구속을 하는 것도, 받는것도 싫은 자유로운 연애를 하는 타입!");
	}
	void typeC(){
		System.out.println("C타입");
		System.out.println("이것은 의리인가 사랑인가 친구같은 편안한 연애를 하는 타입!");
	}
	void typeD(){
		System.out.println("D타입");
		System.out.println("무조건 잘해주고, 무조건 맞춰주는 다퍼주는 연애를 하는 타입!");
	}
	
}
