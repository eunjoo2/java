package z_exam;

public class eeee2r {

	public static void main(String[] args) {
		int sum = 0; // (1..총합)
		int num = 0;
		int s = 1;

		for (int i = 1; true; i++, s=-s) {
			num = i * s;
			sum += num;
			if (sum == 100) {
				break;
			}

		}

		System.out.println(num);
		System.out.println(sum);

	}

}
