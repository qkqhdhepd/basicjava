package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		/*
		 * << 정렬 >>
		 * - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리 바꾸기를 반복해
		 * 		앞에서부터 작은수를 채워 나가는 방식
		 * - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해
		 * 		뒤에서 부터 큰수를 채워나가는 방식
		 * - 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는 방식
		 * 
		 * - 석차구하기 : 모든 정수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 * 		 
		 * */
		
		
		
		int[] numbers = new int[10];
		for(int i = 0; i< numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		shuffle(numbers);
//		System.out.println(Arrays.toString(numbers));
		String arrayStr = Arrays.toString(numbers);// 배열의 모든 인덱스에 저장된 값을 문자열로 변환한다.
		System.out.println(arrayStr);
		
//		printRank(numbers);
		
//		selectSort(numbers);

//		boubleSort(numbers);
		
		insertSort(numbers);
		
	}

	private static void insertSort(int[] numbers) {
//		int tmp = 0;
//		for(int i = 1; i < numbers.length; i++){
//			for(int j = i-1; j >=0; j--){
//				if(numbers[i]<numbers[j]){
//					tmp = numbers[i];
//					numbers[i] = numbers[j];			
//					numbers[j] = tmp;
//					i--;
//				}
//			}
//		}System.out.println(Arrays.toString(numbers));
		
//		sem 답
		for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for(j = i-1; j>=0; j--){
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{
					break;
				}
			}
			numbers[j+1] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

	private static void boubleSort(int[] numbers) {
//		int tmp = 0;
//		for(int i = 0; i<numbers.length; i++){
//			int j = 0;
//			while(true){
//				if(numbers[i]>numbers[j]){
//					tmp = numbers[i];
//					 numbers[i] = numbers[i-1];
//					 numbers[i-1] = tmp;
//				}
//			}System.out.println(Arrays.toString(numbers));
//		}
		
		
		int tmp;
		for(int i = 0; i<numbers.length-1; i++){
			
			boolean changed  = false;
			//boolean을 사용하여 for문으로 접근을 했는지 확인할 수 있다.
			//안쪽 for 문을 다 돌고 나왔을  때 if의 break를 걸어서 확인가능하다.
			for(int j = 0; j<numbers.length-i-1; j++){
				if(numbers[j]>numbers[j + 1]){
					 tmp = numbers[j];
					 numbers[j] = numbers[j + 1];
					 numbers[j + 1] = tmp;
					 changed = true;
				}
			}
			if(changed == false){
				break;
			}			
		}System.out.println(Arrays.toString(numbers));
	
	}
		
		


	private static void selectSort(int[] numbers) {
		
		int[] tmp = new int[numbers.length];
		
		for(int i = 0; i<numbers.length-1; i++){
			for(int j = i+1; j<numbers.length; j++){
				if(numbers[i]>numbers[j]){
					 tmp[i] = numbers[i];
					 numbers[i] = numbers[j];
					 numbers[j] = tmp[i];
				}
			}
		}System.out.println(Arrays.toString(numbers));
	}

	private static void printRank(int[] numbers) {
		
		int[] rank = new int[10];
		for(int i = 0; i<rank.length; i++){
			rank[i] =1;
		}
		for(int i = 0; i<numbers.length; i++){
			for(int j = 0; j<numbers.length; j++){
				if(numbers[i]<numbers[j]){
					rank[i]++;
				}
			}
		}System.out.println(Arrays.toString(rank));	
		for(int i = 0; i<numbers.length; i++){
			System.out.print(numbers[i] +"점을 받은 사람의 등수는 "+ " = " + rank[i] + "등" );
			System.out.println();
		}
		
	}

	private static void shuffle(int[] numbers) {
		for(int i = 0; i<numbers.length * 10; i++){
			int random = (int)(Math.random()* numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		}
		
	}

}
