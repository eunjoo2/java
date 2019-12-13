package e_oop;

import java.util.Scanner;

public class Music {

	public static void main(String[] args) {
		new Music().music1();

	}

	
	String [] ballade= {"김필","마크둡","멜로망스","문문","박원",
						"윤딴딴","정승환","커피소년","태연","폴킴",
						"프라이머리","10cm","황치열"};
	
	
	String boyidol[] = {"젝스키스","NCT","노을","동방신기","에프티아일랜드",
						"샤이니","인피니트","비투비","방탄소년단","갓세븐",
						"블락비","세븐틴","엑소"};
	
	String girlidol[] = {"트와이스","여자친구","레드벨벳","마마무","소녀시대",
						"에이핑크","오마이걸","러블리즈","여자아이들","모모랜드",
						"다비치","아이유","아이오아이"};
	
	String hiphop[] = {"넉살","딥플로우","크러쉬","사이먼도미닉","그레이",
						"하온","딘딘","로꼬","행주","영비",
						"빈첸","펀치넬로","기리보이"};
	Scanner scanner = new Scanner(System.in);
	
	
	void music1(){
		int num1 = 0;
		System.out.println("무슨 장르의 노래가 듣고 싶은가요?");
		System.out.println("발라드,아이돌,랩");
		
		String answer = scanner.nextLine();
		
		if(answer.equals("발라드")){
			
			for(int i =0; i < ballade.length; i++){
				
			num1=(int)(Math.random()*ballade.length);
				String tmp = ballade[i];
				ballade[i] = ballade[num1];
				ballade[num1] = tmp;		
		}	
			System.out.println(ballade[num1]);
		
		}else if(answer.equals("아이돌")){
			music2();
		
		}else if(answer.equals("랩")){
			music3();
		}
}
	void music2(){
		
		int num2 =0;
		int num3 =0;
		System.out.println("보이그룹 과 걸그룹 중 누가 좋으신가요");
		System.out.println("남자,여자");
		String answer = scanner.nextLine();
		if(answer.equals("남자")){
			for(int i =0; i < boyidol.length; i++){
				num2=(int)(Math.random()*boyidol.length);
				String tmp = boyidol[i];
				boyidol[i] = boyidol[num2];
				boyidol[num2] = tmp;			
			}
			
			System.out.println(boyidol[num2]);
			
			}else{
			for(int i =0; i < girlidol.length; i++){
				
				num3=(int)(Math.random()*girlidol.length);
				
				String tmp = girlidol[i];
				girlidol[i] = girlidol[num3];
				girlidol[num3] = tmp;
		
			}
			
			System.out.println(girlidol[num3]);
			}
		}
	void music3(){
		
		int num4 = 0;
		
		System.out.println("랩");
		
			for(int i =0; i < hiphop.length; i++){
				
			num4=(int)(Math.random()*hiphop.length);
				String tmp = hiphop[i];
				hiphop[i] = hiphop[num4];
				hiphop[num4] = tmp;		
		}	
			System.out.println(hiphop[num4]);
		
		}
		
		
	

	}