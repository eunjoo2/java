package c_statement;

import java.util.Scanner;




public class conditionalStatement {

	public static void main(String[] args) {
		
		
		int a = 10;
		if(a < 100) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
					}
		
		if (a < 10) {
			System.out.println("조건식의 결과가 false이면 수행되지 않는다.");
					}
		
		int regNo = 6; //주민등록번호 첫자리
		String gender = null; //성별
		
		if(regNo == 1){
			gender = "남자";
		}else if(regNo == 2){
			gender = "여자";
		}else if(regNo == 3){
			gender = "남자";
		}else if(regNo == 4){
			gender = "여자";
		}else{
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다");
		
//		수행할 내용이 동일한 경우 논리연산자를 사용해 조건식을 결합 가능
		
		if(regNo == 1 || regNo == 3)
			gender = "남자";
			else if (regNo == 2 || regNo == 4)
				gender = "여자";
				else gender = "확인불가";
			
		
		
		int score = 140;
		String grade = null;
		
		if(score>=90) grade ="A";
		else if (score>=80 && score<90) grade = "B"; //&&연산자이기에 앞이 false 면 뒤는 보지 않음.
		else if (70 <= score) grade = "C";
		else if (60 <= score) grade = "D";
		else grade = "F";
		System.out.println(score+"점에 해당하는 등급은 "+grade+"입니다.");
		
//		등급 안에서 + 와 - 를 나누어보자.
		score = 78;
		grade = null;
		
		if (score >= 90 ){
			grade = "A";
			if(score>=97){
				grade += "+";
			}else if (score<=93){
				grade += "-";
			}
		}
		else if (score >= 80){
			grade = "B";
			if(score>=87){
				grade += "+";
			}else if (score<=83){
				grade += "-";
			}
		}
		else if (score >= 70){
			grade = "C";
			if (score>=77){
				grade += "+";
			} else if (score <= 73){
				grade += "-";
			}
		}
		else if (score >=60){
			grade="D";
			if (score >= 67){
				grade += "+";
			}else if (score <= 63){
				grade += "-";
			}
		}
		else grade = "F";
		System.out.println(score+"에 해당하는 등급은 "+grade+"입니다.");
		
		
		regNo = 2;
		gender = null;
		
		
		
		
		switch(regNo){  		//조건식의 연산결과는 정수와 문자열만 허용
		case 1 : 				//case문의 값은 리터럴과 상수만 사용 가능
			gender = "남자"; 
			break;				//break를 만나면 switch문을 빠져나간다.
		case 2 :
			gender = "여자"; 
			break;
		case 3 :
			gender = "남자";
			break;
		case 4 :
			gender = "여자";
			break;
		default :
			gender = "확인불가";
		}
		System.out.println("당신의 성별은 " + gender + "입니다");
		
		
		score = 94;
		grade = "B";
		boolean sss;
		
		
		
		/*
		switch(grade){
		
		case "A" : sss= score>90 ; break;
		
		
		}
		System.out.println(grade);
		
		*/
		
		switch (score / 10) {
		case 10:
			grade = "A";
			break; // 10번 넣는걸 깜뿍함....
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score+"에 해당하는 등급은 "+grade+"입니다.");
		
		//콘솔창에서 입력받는 방법
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("스캐너를 입력해주세요 : ");
		String input1 = s.nextLine(); //사용자에게 입력받은 문자열을 반환한다. 
		System.out.println("입력받은 문자열 : " + input1);
		
		
	/*	System.out.println("스캐너를 입력해주세요 : ");
		String input1 = s.nextLine(); //사용자에게 입력받은 문자열을 반환한다. 
		System.out.println("입력받은 문자열 : " + input1);
		
		System.out.println("숫자를 입력해주세요 : ");
//		s.nextInt(); //버그가 있기 때문에 사용하지 말자!
		int input2 = Integer.parseInt(s.nextLine());
	
		System.out.println("입력받은 숫자 : " + input2);
		
		
		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		
		System.out.println("문자열을 입력해주세요 : ");
		String input3 = s.nextLine();
		System.out.println("입력받은 문자열 : " + input3);
		
		
		System.out.println("숫자를 입력해주세요 : ");
		int input4 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자열 : " + input4);
		
	*/
		/*
		//숫자를 입력받고 그 숫자가 0인지 0이 아닌지 출력하라
		
		
		System.out.println("숫자를 입력하세요 : ");
		int aw = Integer.parseInt(s.nextLine());
//		System.out.println(aw == 0 ? "숫자는 0입니다." : "숫자는 0이 아닙니다.");
		
		if (aw == 0) {
			System.out.println("숫자는 0입니다.");
		} else
			System.out.println("숫자는 0이 아닙니다.");
		
		*/
		
		//숫자가 홀수인지 짝수인지 출력하라
		
		
/*		System.out.println("숫자입력 : ");
		int write = Integer.parseInt(s.nextLine());
		
		if(write%2==0){
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else System.out.println("입력하신 숫자는 홀수입니다.");
*/		
		
		
//		점수를 3개 입력받아 총점, 평균, 등급을 출력하라
		
		System.out.print("점수1 : ");
		int fir = Integer.parseInt(s.nextLine());
		System.out.print("점수2 : ");
		int sec = Integer.parseInt(s.nextLine());
		System.out.print("점수3 : ");
		int thi = Integer.parseInt(s.nextLine());
		
		double ave = (fir+sec+thi)/3.0;
		
		System.out.println("총점 : "+ (fir+sec+thi));
		System.out.println("평균 : "+ ave);
				
		if (ave >= 90) {
			grade = "A";
		} else if (ave >= 80) {
			grade = "B";
		} else if (ave >= 70) {
			grade = "C";
		} else if (ave >= 60)
			grade = "D";
		else
			grade = "F";

		System.out.println("등급 : "+ grade);
		
		
		
		
		
		
	}
	
}
