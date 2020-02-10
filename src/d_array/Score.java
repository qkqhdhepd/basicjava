package d_array;

import java.util.*;

public class Score {

	public static void main(String[] args) {
//		/*
//		 * 우리반 모두의 JAVA, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로 생성하고
//		 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
//		 * 
//		 * 
//		 * 석차		이름		JAVA		Oracle		HTML		CSS		JQuery		JSP		총점		평균
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 * 1		홍길동	100			90			80			70			60		50		350		75.0
//		 */
//		
//		int[][] test = new int[8][10];
//			
//		
//		
//		int[] JSP = new int[10];
//		int[] JQuery = new int[10];
//		int[] CSS = new int[10];
//		int[] HTML = new int[10];
//		int[] Oracle = new int[10];
//		int[] Java = new int[10];
//		
//		int[] sum = new int[10];
//		int[] rank = new int[10];
//		String[] grade = new String[10];
//		
//		String[] name = new String[10];
//		double[] avg = new double[10];
//		
//		int[] sum2 = new int[6];
//		double[] avg2 = new double[6];
//		//각 과목별로 랜덤한 숫자를 넣음(모두 10명이라고 가정)
//	
//		for(int i = 0; i<10; i++){
//			Java[i]=(int)(Math.random()*51)+50;
//			Oracle[i]=(int)(Math.random()*51)+50;
//			HTML[i]=(int)(Math.random()*51)+50;
//			CSS[i]=(int)(Math.random()*51)+50;
//			JQuery[i]=(int)(Math.random()*51)+50;
//			JSP[i]=(int)(Math.random()*51)+50;
//		}
//		
//		//모든 학생의 이름을 홍길동이라고 가정
////		for(int i = 0; i<10; i++){
////			name[i] = "홍길동";
////		}System.out.println(name[0]);
//		//모든 학생의 이름을 부여
//		name[0] = "홍길동";
//		name[1] = "김길동";
//		name[2] = "앙기모";
//		name[3] = "지리산";
//		name[4] = "백두산";
//		name[5] = "자바스";
//		name[6] = "이길동";
//		name[7] = "유튜브";
//		name[8] = "빠삐코";
//		name[9] = "황길동";
//		
//		
////		
//		
//		//총합과 평균 구하기
//		
//		for(int i = 0; i<10; i++){
//			sum[i] += Java[i]+Oracle[i]+HTML[i]+CSS[i]+JQuery[i]+JSP[i];
//			avg[i] = Math.round((double)sum[i]/6);
//		}
//		
//		//석차구하기
//		
//		for(int i = 0; i<avg.length; i++){
//			rank[i] =1;
//		}
//		for(int i = 0; i<10; i++){
//			for(int j = 0; j<10; j++){
//				if(avg[i]<avg[j]){
//					rank[i]++;
//				}
//			}
//		}	
//		
//
//	
//		등급 매기기
//		예를들어 평균이 90점이상이면 A
//					80점 이상 89 이하 이면 B
//					70점 이상 79 이하 이면 c
//		 			나머지는 F
//		
//		for(int i = 0; i<10; i++){
//			if(90<=avg[i]){
//				grade[i] = "A";
//			}else if(80<= avg[i] && avg[i]<90){
//				grade[i] = "B";
//			}else if(70<= avg[i] && avg[i]<80){
//				grade[i] = "C";
//			}else if(60<= avg[i] && avg[i]<70){
//				grade[i] = "D";
//			}else{
//				grade[i] = "F";
//			}
//		}
//		
		//과목별 sum2 ,평균 구하기
//		for(int i = 0; i<6; i++){
//			for(int j = 0; j <10; i++){
//				if(i == 0){
//					sum2[i] += Java[j]; 
//				}else if(i == 1){
//					sum2[i] += Oracle[i];
//				}else if(i == 2){
//					sum2[i] += HTML[i];
//				}else if(i == 3){
//					sum2[i] += CSS[i];
//				}else if(i == 4){
//					sum2[i] += JQuery[i];
//				}else if(i == 5){
//					sum2[i] += JSP[i];
//				}
//			}
//		}
		
		
		
		
		
		
//----------------------------------------------------------------		
//		//2차원 배열에 모든 값 집어넣기
//		for(int i = 0; i<8; i++){
//			for(int j = 0; j<10; j++){
//				if(i == 0){
//					test[i][j] = sum[j];
//				}else if(i ==1){
//					test[i][j] = JSP[j];
//				}else if(i ==2){
//					test[i][j] = JQuery[j];
//				}else if(i ==3){
//					test[i][j] = CSS[j];
//				}else if(i ==4){
//					test[i][j] = HTML[j];
//				}else if(i ==5){
//					test[i][j] = Oracle[j];
//				}else if(i ==6){
//					test[i][j] = Java[j];
//				}else if(i ==7){
//					test[i][j] = rank[j];
//				}
//				
//			}
//		}
//		
//		
//		
//		//컬럼 출력하기
//		System.out.println();
//		System.out.println();
//		System.out.println("석차" + "    "+"      "+ "이름" + "            "+ "JAVA" + "     "+ "Oracle" + "     "+ 
//							"HTML" + "     "+ "CSS" + "     "+ "JQuery" + "     " + "JSP" + "       " + "총합" + "              " +
//							"평균" + "               " + "등급"
//							);
//		System.out.println();
//		System.out.println();
//		//변수값 출력하기
//		for(int i = 0; i<10; i++){
//			for(int j = 7; j>=0; j--){
//				System.out.print(test[j][i]+ "       ");
//				if(j == 7){
//					System.out.print(name[i]+"              ");
//				}else if(j == 0){
//					System.out.print(avg[i]+"         "+grade[i]);
//					System.out.println();
//				}
//			}System.out.println();
//		}
//		
//	
//	
//		-----------------------------------------------------------------------------
		

			
				/*
				 * 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50 ~ 100까지 랜덤으로 생성하고,
				 * 석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
				 * 
				 * 석차	이름		Java	Oracle	HTML	CSS		JQuery	JSP		총점		평균		등급
				 * 1	홍길동	100		90		80		70		60		50		350		75.0	C
				 * 1	홍길동	100		90		80		70		60		50		350		75.0
				 * 1	홍길동	100		90		80		70		60		50		350		75.0
				 * 1	홍길동	100		90		80		70		60		50		350		75.0
				 * 1	홍길동	100		90		80		70		60		50		350		75.0
				 * 1	홍길동	100		90		80		70		60		50		350		75.0
				 * 과목별 평균		100		90		80		70		60		50
				 */
				
//				String[] students = {"유웅", "김태진", "이재호", "이용춘"};
//				String[] subjects = {"Java", "Oracle", "HTML", "CSS", "JQuery", "JSP"};
//				double[][] scores = new double[students.length][subjects.length + 3];
//				
//				for(int i = 0; i < scores.length; i++){
//					scores[i][0] = 1;
//					for(int j = 0; j < subjects.length; j++){
//						scores[i][j + 1] = (int)(Math.random() * 51) + 50;
//					}
//				}
//				
//				for(int i = 0; i < scores.length; i++){
//					for(int j = 0; j < subjects.length; j++){
//						scores[i][scores[i].length - 2] += scores[i][j + 1];
//					}
//					scores[i][scores[i].length - 1] = (int)((double)scores[i][scores[i].length - 2] / subjects.length * 100 + 0.5) / 100.0;
//				}
//				
//				for(int i = 0; i < scores.length; i++){
//					for(int j = 0; j < scores.length; j++){
//						if(scores[i][scores[i].length - 1] < scores[j][scores[j].length - 1]){
//							scores[i][0]++;
//						}
//					}
//				}
//				
//				for(int i = 0; i < scores.length - 1; i++){
//					for(int j = i + 1; j < scores.length; j++){
//						if(scores[i][0] > scores[j][0]){
//							double[] temp = scores[i];
//							scores[i] = scores[j];
//							scores[j] = temp;
//							
//							String tempName = students[i];
//							students[i] = students[j];
//							students[j] = tempName;
//						}
//					}
//				}
//				
//				System.out.print("석차\t이름");
//				for(int i = 0; i < subjects.length; i++){
//					System.out.print("\t" + subjects[i]);
//				}
//				System.out.println("\t총점\t평균");
//				
//				for(int i = 0; i < scores.length; i++){
//					System.out.print((int)scores[i][0] + "\t" + students[i]);
//					for(int j = 1; j < scores[i].length; j++){
//						if(j == scores[i].length - 1){
//							System.out.print("\t" + scores[i][j]);
//						}else{
//							System.out.print("\t" + (int)scores[i][j]);
//						}
//					}
//					System.out.println();
//				}
//			}

//		}









	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
