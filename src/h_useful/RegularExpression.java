package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	뒷문자로 시작
		 * $	앞문자로 종료
		 * .	임의의 문자(줄바꿈 제외)
		 * *	앞문자가 0개 이상
		 * +	앞문자가 1개이상
		 * ?	앞문자가 없거자 1개
		 * []	문자의 집합이나 범위([a-z] ; a부터 z까지, [^a-z] : a 부터 z가 아닌 것)
		 * {}	앞 문자의 개수({2} ; 2개,{2,4} : 2개이상 4개 이하)
		 * ()	그룹화(1개의 문자처럼 인식)
		 * |	OR연산
		 * \s	공백, 텝, 줄바꿈
		 * \S	공백, 텝, 줄바꿈이 아닌 문자
		 * \w 	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 *(?i) 	뒷문자의 대소문자 구문 안함
		 * \	정규 표현식에서 사용되는 특수문자 표현
		 */
		
		//패턴을 표기할땐 자세하게 내가 원하는 조건만 충족하게 만드는것이 좋다.
		
//		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";//a-z까지 3개가 오고 0-9까지가 1개에서 3개 까지 올수 있다.
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
//		String regex = ".*"; //어떠한 문자라고 틍과할 수 있다.
		
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		//아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
		
		String str = "qwert12@naver.com";
		
		String id = "[a-z0-9_-]{5,20}";
		String hp = "[0-9]{3}-[0-9]{3,4}-\\d{4}";
		String e = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p = Pattern.compile(e);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
	}

}











