package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * <<배열 >>
		 *  - int[] number = new int[5];
		 *  - int[] number = new int[]{10,20,30,40,50};
		 *  - int[] number = {10, 20, 30, 40, 50};
		 */
		
		
		//배열은 참조형 타입입니다.
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //벼열이 생성되고 그 주소가 저장된다.
		//new : 새로운 저장공간 생성 및 주소 반환
		//int[5] : int를 저장할 수 있는 5개의 공간
		//배열 초기화시 기본값이 저장된다.
		
		System.out.println(array);
		
		System.out.println(array[0]); //실제 값에 접근하기 위해서는 index를 지정해야 한다.
		//index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		//배열의 최대 크기는 int의 최대값(약20억)이다.
		
		
		String arrayStr = Arrays.toString(array);// 배열의 모든 인덱스에 저장된 값을 문자열로 변환한다.
		System.out.println(arrayStr);
		
		int[] iArray1 = new int []{1,2,3}; //값의 개수로 배열의 길이가 정해진다.
		String arrayStr1 = Arrays.toString(iArray1);
		System.out.println(arrayStr1);
		int[] iArray2 = {1,2,3};//선언과 초기화를 동시에 해야한다.반드시
		
		String arrayStr2 = Arrays.toString(iArray2);
		System.out.println(arrayStr2);

//		int[] iArray3;
//		iArray3 = {1,2,3};//컴파일 에러 발생
		
		
		array[0] = 10; //인덱스는 0부터 시작한다.
		array[1] = 20; 
		array[2] = 30; 
		array[3] = 40; 
		array[4] = 50; 
//		array[5] = 60; //에러 발생		java.lang.ArrayIndexOutOfBoundsException: 5	
//																			at d_array.Array.main(Array.java:48)
//		array가 index범위를 벗어났다. 그 인덱스가 5이다.(5는 없다)
		
		
		//정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		
		int[] ary = new int[10];
		
		
		//모든 인덱스에 있는 값을 변경해주세요.
		ary [0] = 0;
		ary [1] = 10;
		ary [2] = 20;
		ary [3] = 30;
		ary [4] = 40;
		ary [5] = 50;
		ary [6] = 60;
		ary [7] = 70;
		ary [8] = 80;
		ary [9] = 90;
		
		String str = Arrays.toString(ary);
		System.out.println(str);
		
		//모든 인덱스에 있는 값을 더해서 출력하시오.
		System.out.println(ary[0]+ary[1]+ary[2]+ary[3]+ary[4]+ary[5]+ary[6]+ary[7]+ary[8]+ary[9]);
		
		
		
		
		//for문으로 모든 인덱스에 있는 값 변경하기
		for(int i = 0; i<10; i++){
			ary [i] = i*10;
		}System.out.println(ary[9]);
		
		//for문으로 모든 인덱스에 있는 값을 더해서 출력하시오.
		int sum = 0;
		for(int i = 0; i<10; i++){
			sum += ary[i];
		}System.out.println("sum의 값은"+sum);
		
		//for문으로 모든 인덱스에 있는 값을 더해서 출력하시오.(배열의 길이를 사용하라)
		int sum1 = 0;
		for(int i = 0; i<ary.length; i++){
			sum1 += ary[i];
		}System.out.println("sum1의 값은"+sum1);
		
		//배열이 숫자를 저장하고 합계와 평균을 구해보자.
		int[] numbers = new int[10];
		
		for(int i = 0; i<numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100)+1;
		}
		System.out.println(Arrays.toString(numbers));
		
		sum = 0;	//합계
		double avg = 0;		//평균
		
		for(int i = 0; i<numbers.length; i++){
			sum += numbers[i];
		}
		avg = (double)sum/numbers.length;                  //소수점을 얻기 위해서 형변환을 필수야!!
		
		System.out.println("랜덤한 10개의 숫자의 합 : " + sum);
		System.out.println("랜덤한 10개의 숫자의 평균 : " + avg);
		
		//모든 값을 출력하기 위해 위에서 함수를 이용함.(for문으로도 저장된 값을 확인할 수 있다.)
		for (int i = 0; i < numbers.length; i++){
			System.out.println("["+ i +"]"+ "번째에 저장된 값 = " + numbers[i]);
		}
		
		
		//향상된 for문
		for(int number : numbers){	//배열이 있는 값을 차례대로 변수에 넣는다.     //(변수 : 배열)타입을 맞춰야 한다.
			System.out.println(number);
		}
		
		//향상된 for문을 사용할  때 배열에 있는 것은 값을 변경시킬수 없고 읽을 때만 사용 가능
		for(int number : numbers){
			number = 0; //numbers의 값은 변경되지 않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));
		
		//배열에 저장된 숫자들 중 최소값과 최대값을 찾아주세요.
		int min = numbers[0];
		int max = numbers[0];
		
		for (int i = 0; i<numbers.length; i++){
			if(min > numbers[i]){
				min = numbers[i];
			}
			if(max < numbers[i]){
				max = numbers[i];
			}
		}
		System.out.println("랜덤한 숫자 중 최소값은 = "+min);
		System.out.println("랜덤한 숫자 중 최대값은 = "+max);
		
		
		//랜덤한 숫자를 활용하여 서로의 배열 값을 바꾸는 형태의 문제이다.
		//for문을 생성해서 배열의 인덱스 값을 가지고 tmp공간을 활용하여 배열의 위치를 서로 바꾸는 것이 포인트 이다.
//		int tmp = 0;                    //두개의 값을 바꾸기 위한 변수공간
//		int a = 0;						//랜덤한 값을 얻기위한 변수공간
//		int[] shuffle = new int[30];
//		for(int i = 0; i<shuffle.length; i++){
//			shuffle[i] = i+1;
//		}										//첫번째 for문으로 30개의 배열을 생성하고 1부터 30까지 생성함.
//		for(int i = 0; i < 15; i++){					//두번째 for문을 10번을 돌림
//			a = (int)(Math.random()*shuffle.length);	//a의 변수에 0부터 29까지의 랜덤한 변수를 저장
//			tmp = shuffle[i];							//tmp공간에 첫번째 배열을 저장
//			shuffle[i] = shuffle[a];					//첫번째 배열에 랜덤한 배열을 저장
//			shuffle[a] = tmp;							//랜덤한 배열의 공간에 다시 첫번째 배열을 넣음
//		}
//		System.out.println(Arrays.toString(shuffle));	//함수를 이용하여 모든 배열의 값을 출력
		
		//1~10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] x = new int[1];
		int[] y = new int[500];
		
		for(int i = 0; i <1; i++){
			x[i] = (int)(Math.random()*10)+1;
			System.out.print(x[i]);
		}
		System.out.println();
//		for(int i = 0; i< x.length; i++){
//			y[x[i]]++;
//		}
//		for(int i = 1; i<=10; i++){
//			System.out.println(i + "의 개수" +y[i]);
//		}
		
		//위 문제의 최소값, 최대값, 반복횟수를 입력 받아 각 숫자가 생성된 횟수를 출력해주세요.
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("최대값을 입력해주세요>");
//		int input1 = Integer.parseInt(scanner.nextLine());  //최대값		20
//		System.out.println("최소값을 입력해주세요>");
//		int input2 = Integer.parseInt(scanner.nextLine()); //최소값		5	20-5 = 15 (5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
//		System.out.println("반복횟수를 입력해주세요>");
//		int input3 = Integer.parseInt(scanner.nextLine());	//반복횟수
//		
//				
//		int[] x = new int[input3*input1+1];            //최대값보다 반복횟수가 커야함
//		int[] y = new int[input3*input1+1];
//		
//		for(int i = 0; i < input3; i++){
//			x[i] = (int)(Math.random()*(input1-input2+1))+input2;
//			System.out.print(x[i]);
//		}
//		System.out.println();
//		for(int i = 0; i< y.length; i++){
//			y[x[i]]++;
//			
//		}
//		for(int i = input2; i<=input1; i++){
//			System.out.println(i + "의 개수" +y[i]);
//		}
		
		

		// 배열을 두개를 생성해서 첫번째 배열에 랜덤한 숫자를 넣음
		// 두번째 배열을 이용해서 카운터를 센다.
		// 세는 과정에서 0부터 세는 것이 아닌 첫번째 배열의 랜덤한 숫자를 기준으로 
		//두번째 index에 넣어서 ( ex x[0] = 5,  => y[5]++ => 결과적으로 y[5]에 1이 들어감
		//최종적으로 최대값과 최소값 사이의 숫자들이 랜덤으로 들어가서 
		//최대값과 최소값 사이의 숫자갯수 만큼 for문을 돌리면 몇개가 카운터 되었는지 알수가 있다.
		//for문의 최대값과 최소값의 사이의 숫자만큼 배열에 저장이 되기 때문이다.
		
//		int[] x = new int[500];
//		int[] y = new int[500];
//		
//		for(int i = 0; i < x.length; i++){
//			x[i] = (int)(Math.random()*10)+1;
//			System.out.print(x[i]);
//		}
//		System.out.println();
//		for(int i = 0; i< x.length; i++){
//			y[x[i]]++;
//		}
//		for(int i = 1; i<=10; i++){
//			System.out.println(i + "의 개수" +y[i]);
//		}
		
		//1~10까지 5번을 반복해서 랜덤한 숫자를 표출해서 그 개수를 세시오.
//		int[] x = new int[5];
//		int[] y = new int[10];
//		
//		for(int i = 0; i < x.length; i++){
//			x[i] = (int)(Math.random()*5)+1;
//			System.out.print(x[i]);
//		}
//		System.out.println();
//		for(int i = 0; i < x.length; i++){
//			y[x[i]]++;
//		}
//		for(int i = 0; i <= x.length ; i++){
//			System.out.println(i+"의 개수"+y[i]);
//		}
		
		
	}
}
