package d_array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
	/*
	 * <<정렬>>
	 * -선택정렬 : 첫번쨰 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수의 자리를 바꾸기를 반복해 앞에서 부터 작은수를 채워나가는 방식
	 * 
	 * -버블정렬 : 척번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리바꾸기를 반복해 뒤에서부터 큰수를 채워나가는 방식
	 * 
	 * -삽입정렬 : 두번째 숫자부터 그앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
	 * 
	 * -석차구하기 : 모든점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 등수를 1씩 증가시키는 방식
	 */

		int[] numbers = new int[10];
		
		for(int i = 0; i< numbers.length; i++){
			numbers[i] = i + 1;
		}
		
	//	shuffle(numbers);
		//System.out.println(Arrays.toString(numbers));
		
		
		selectsort(numbers); //선택정렬
//		bubbleSort(numbers);//버블정렬
//		insertSort(numbers); //삽입정렬
//		printRork(numbers); //석차구하기
		
		System.out.println(Arrays.toString(numbers));
	}

/////////////석차구하기
	
/*	private static void printRork(int[] numbers) {
		int[]rank = {1,1,1,1,1,1,1,1,1,1};
		
		for(int i = 0; i< numbers.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i]++;
			
			}
		
		}
		
	}
		for(int i = 0; i< numbers.length; i++){
		System.out.println(numbers[i] + " : " + rank[i] + "등");
}
*/

///////////////////삽입구현
	
	/*private static void insertSort(int[] numbers) {
		
	for (int i = 1; i < numbers.length; i++){
		int temp = numbers[i];
		
		int j =  0;
		
		for(j = i - 1; j >= 0; j--){
			if(temp < numbers[j]){
				numbers[ j+1 ] = numbers[j];	
			}else break;
			
		}numbers[j + 1 ] = temp;
	}	
	
	}*/

//////////////////버블구현

/*private static void bubblesort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++){
			boolean change = false;
			for (int j = 0; j < numbers.length -i -1; j++ ){
			if(numbers[j] > numbers[j + 1]){
				int temp = numbers[j];
				numbers[j] = numbers[j+1];
				numbers[j+1] = temp;
				change = true;
		
			}System.out.println(Arrays.toString(numbers));
		}
		if (!change) {
			break; }
		}
	}
*/

////////////////////선택구현

private static void selectSort(int[] numbers) {
	
		
		for(int i = 0; i < numbers.length - 1; i++){
			for (int j = i + 1; j < numbers.length; j++){
				if(numbers[i] > numbers[j]){
					int temp = numbers[i];
					numbers[i]	= numbers[j];
					numbers[j]	= temp;
			
				}
			}
		}	
	}

	private static void shuffle(int[] numbers) {
		for(int i = 0; i <numbers.length * 10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}
	
	
	

}
