package z_exam;

public class eeeeeeeeee {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		// //
		// int sum = 0; //(1..총합)
		// int num = 0;
		// int s = 1;
		//
		// for(int i = 0; true; i++, s += -s){
		// num = i * s;
		// sum += num;
		// if( sum == 100){
		// break;
		// }
		// }
		// System.out.println(num);
		// System.out.println(sum);
		// //
		// sum은 1씩 증가, n는 -2씩 감소
		// for(int i = 1;true; i++){
		//
		// if (i % 2 == 0)i= -i;
		// sum += i;
		//
		// if(sum >= 100)
		// break;
		// }
		// System.out.println("num="+num);
		// System.out.println("sum="+sum);

		/*
		 * 100까지 짝수만 더하시오
		 * 
		 * int sum=0;
		 * 
		 * for(int i=1;i<=100;i++){
		 * 
		 * if(i % 2 == 0)sum += i;
		 * 
		 * } System.out.println(sum);
		 */

		/*
		 * for(int i=0; i<=10; i++) { for(int j=0; j<=i; j++)
		 * System.out.print("*"); System.out.println(); }
		 */
		int i = 0;
		while (i <= 10)
		{
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}