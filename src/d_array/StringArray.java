package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		String s = new String("ABCD");	//참조형 타입을 초기화 하는 방법
		String str ="ABCD";	//String타입만 new 없이 초기화가 가능하다.
		
		char[]charArray = str.toCharArray();
		System.out.println(charArray);	//char 배열은 특별히 배열의 내용이 출력된다.
		
		//String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
		
		/*
		 * <<String의 주요 메서드
		 * -equals()	: 문자열의 내용이 같은지 확인
		 * -length()	: 문자열의 길이를 반환
		 * -charAt()	: 문자열에서 해당위치에 있는 문자를 반환
		 * -substring()	: 문자열에서 해당범위에 있는 문자열을 반환
		 * -indexOf()	: 문자열 내외 특정 문자열의 인덱스반환
		 * -replace()	: 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
		
		for (int i = 0; i< str.length(); i++){
			System.out.println(str.charAt(i));
			
		}
			String revStr = ";"; //str을 거꾸로 담을 변수
			//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		
			
			for(int i = str.length() -1; i >= 0; i--){
				revStr += str.charAt(i);
			}
			System.out.println(revStr);
			
			str = "0123456789";
			String sub1 = str.substring(3); //3번 인덱스부터 끝까지 잘라서 잔환
			System.out.println(sub1);
			
			String sub2 = str.substring(5, 8);
			System.out.println(sub2);
			
			str = "치킨 피자 돈까스 떡볶이";
			int idx = str.indexOf("피자"); //피자의 시작 인덱스를 반환한다.
			System.out.println(idx);
			
			idx = str.indexOf("헴버거");
			System.out.println(idx); //해당되는 문자열이 엾는 경우 -1을 반환한다.
			
			String[] menus = {
					"치킨 18000원",
					"피자 9900원",
					"돈까스 8900원",
					"떡볶이 500원"
					
			};
			
			for(String menu : menus){
				String name =  menu.substring(0, menu.lastIndexOf(" "));
				System.out.println(name);
				
		
			int price = Integer.parseInt(
					menu.substring(menu.indexOf(" ")+ 1, menu.indexOf("원")));
			
			System.out.println(price);
			
			}
			
			str = "123456789";
			str =str.replace("3", "짝");
			System.out.println(str);
			str =str.replace("6", "짝");
			System.out.println(str);	
			str =str.replace("9", "짝");
			System.out.println(str);	
			
			
			String pn = "010-2363-3647";
			pn = pn.replace("-", "");	//replace 문자열은 (바꾸고싶은 문자열,원하는 문자열)에 바꾸고 싶은 문자열의 입력한 문자를 전부 찾아서 바꿔준다.
			System.out.println(pn);
			
			
			//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
			//123456789-->123,456,789
			/*
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			String input = scanner.nextLine();
			
			
			String num = input;
			String tmp1 = "";
			String tmp2 = num;
			
			for(int a = num.length()-3; a > 0; a=a-3 ){
				tmp1 = ","+num.substring(a,a+3)+tmp1;
				tmp2 = num.substring(0,a);
			}
			System.out.println(tmp2+tmp1);
			*/
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력해 주세요>");
			String number = sc.nextine();
			String newNumber = "";
			
			int count = 0;
			
			for(int i = number.length()- 1; i >= 0; i--){
				newNumber = number.charAt(i) = newNumber;
				count++;
				if(count % 3 == 0 && count != number.length()){
					newNumber = "," + newNumber;
				
			})
			sy
						
			}

		

			
		
	}

}
