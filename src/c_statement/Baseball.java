package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//숫자야구게임을 만들어 주세요.
		
		Scanner sc = new Scanner(System.in);
		
		int hh;
		int h1 = 0, h2 = 0, h3 = 0; //사람
		int c1 = 0, c2 = 0, c3 = 0; //컴퓨터
		int STRIKE = 0, BALL = 0, OUT = 0;		
		int count = 0;
		
		
		c1 = (int)(Math.random()*9)+ 1;
		
		do{
			c2 = (int)(Math.random()*9)+1;
		}while(c2==c1);
		
		do{
			c3 =(int)(Math.random()*9)+1;
		}while(c3==c1 || c3==c2);
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);
		
		System.out.println("숫자 3개를 입력해 주세요 ( ex. 1. 2. 3) : ");
		hh = Integer.parseInt(sc.nextLine());
		
		h1 = hh/100 % 10;
		h2 = (hh/10) % 10;
		h3 = hh % 10;

			
			if(h1 == c1)
				STRIKE++;
			else if(h1 == c2 || h1 == c3)
				BALL++;
			else {
				OUT++;
			}
			
			if(h2 == c2)
				STRIKE++;
			else if(h2 == c1 || h2 == c3)
				BALL++;
			else {
				OUT++;
			}
			if(h3 == c3)
				STRIKE++;
			else if(h3 == c1 || h3 == c2)
				BALL++;
			else {
				OUT++;
			}
				
			
			System.out.println(++count + "차시도( "+ h1 + h2 + h3 + ") : " + STRIKE + "STRIKE "+ BALL + "BALL " + OUT + "OUT");
			
			System.out.println("-------------------------------");
			if(STRIKE == 3){
				System.out.println("성공하셨습니다."); 
			} break;
			
			
}

}