package d_array;

import java.util.ArrayList;
import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로
		 * 생성시켜주시고, 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		 * 
		 * 순위 이름 Java Oracle HTML CSS JQuery JSP 총접 평균 1 홍길동 90 100 80 50 30 90
		 * 400 70
		 * 
		 * 
		 * scores[i][j] = (int)(Math.random()*100)+1; sum[i] += scores[i][j];
		 * //합계 avg[i] = (double)sum[i]/scores[i].length; //평균
		 */

		// int sum[][] = new int [3][7];

		//
		// String[] people = { "정대석","박종민","이누리","김지석","정재영","김경운","이예림"
		// ,"정보람","이지형","윤창훈","민태홍","백종빈","박진영","구한나"
		// ,"강현지","주향한","강현철","이승재","연은주","이병훈","김령환"};
		//
		// double avg[] = new double [21];
		// int scores[][] = new int[21][7];
		//
		// String[] sub = {"Java","Oracle","HTML","CSS","JQuery","JSP"};
		//
		// double[] rak[] = {{1, 2, 3, 4, 5, 6, 7}
		// ,{8, 9, 10, 11, 12, 13, 14}
		// ,{15, 16, 17, 18, 19, 20, 21}};
		//
		//
		//
		// for(int i = 0; i < scores.length; i++){
		// int h = 0;
		// for(int j = 0; j < scores[i].length-1; j++){
		// scores[i][j] = (int)(Math.random()*51)+50;
		// h += scores[i][j];
		// }
		// scores[i][6] = h;
		// avg[i] =(double) h/sub.length;
		//
		// }
		// System.out.println(Arrays.toString(h));

		// for(int i = 0; i < people.length; i++){
		// for(int j = 0; j < people[i].length; j++){
		// ;
		//
		//
		// }System.out.println(Arrays.toString(sum));
		//
		// }

//		 System.out.println("석차 \t" + "이름\t" +
//		 "Java \t"+"Oracle\t"+"HTML\t"+"CSS\t"+"JQuery\t"+"JSP\t"+ "총점\t" +
//		 "평균\t");
		//
		//
		// int rank[] = new int [21];
		// for(int i = 0; i < scores.length; i++){
		// for(int j = 0; j < scores[i].length; j++){
		// rank[i] = 1;
		// if(scores[i][6]< scores[j][6]){
		// rank[i]++;
		//
		//
		// }
		// }
		// }
		// for(int i = 0; i < scores.length; i++){
		// System.out.println(rank[i]+"\t"+ people[i] +"\t");
		// }

		String[] students = { "정대석", "박종민", "이누리", "김지선", "정보람", "이승재", "백종빈",
				"강현지", "주향한", "강현철", "정재영", "이지형", "김령환", "이예림", "박진영", "구한나",
				"이병훈", "연은주", "민태홍", "윤창훈", "김경운" };
		String[] subjects = { "java", "Oracle", "HTML", "CSS", "JQuery", "JSP" };
		double[][] scores = new double[students.length][subjects.length + 3];
		// 점수를 입력한다.
		for (int i = 0; i < scores.length; i++) {
			scores[i][0] = 1; // 석차
			
			for (int j = 0; j < subjects.length; j++) {
				scores[i][j + 1] = (int) (Math.random() * 51) + 50;
			}
		}

		// 총점과 평균을 구한다
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < subjects.length; j++) {
				scores[i][scores[i].length - 2] += scores[i][j + 1];
			}
			scores[i][scores[i].length - 1] = (int) (scores[i][scores[i].length - 2]
					/ subjects.length * 100 + 0.5) / 100.0; // 평균
		}

		// 석차를 구한다.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]) {
					scores[i][0]++;
				}
			}
		}
		// 정렬한다
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = i + 1; j < scores.length; j++) {
				if (scores[i][0] > scores[j][0]) {
					double[] temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;

					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
				
		// 출력한다
		System.out.print("석차\t이름");
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]);
		}
		System.out.print("\t총점\t평균");

		for (int i = 0; i < scores.length; i++) {
			System.out.print((int) scores[i][0] + "\t" + students[i]);
			for (int j = 1; j < scores[i].length; j++) {
				System.out.print("\t" + scores[i][j]);
			}
			System.out.println();
		}
		System.out.print("과목별 평균\t");
		for(int i = 1;i <= subjects.length; i++){
			double sum = 0;
		for(int j = 1;j <= subjects.length; j++){
			sum +=scores[j][i];		
		}
		double avg =(int)(sum / scores.length* 100 +0.5)
				/100.0;
		System.out.print("\t" +avg);
		
	}

	}
	}

