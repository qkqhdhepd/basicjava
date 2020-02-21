package z_exam;

import java.util.Arrays;


//public class E20200207 {
//
//	public static void main(String[] args) {
//      문제1.
//
//      arr배열의 모든값을 더하는 프로그램을 작성하세요
//      int[] arr ={10,20,30,40,50}
//
//      int[] arr = {10,20,30,40,50};
//      int sum = 0;
//      for(int i = 0; i < arr.length; i++){
//         sum += arr[i];
//      }System.out.println(sum);
//
//      
//      
//      
////      문제2 
////
////      5명의 이름을 입력받아 배열에 저장하는 프로그램을 작성하세요.
//
//      String[] name = new String[5];
//      for(int i = 0; i < name.length; i++){
//         name[i] = "홍길동";
//         System.out.println(name[i]);
//      }
//      
//      
//       
////      문제3
////
//      int[] score = { 79, 88, 91, 33, 100, 55, 95}
//      score배열의 최대값, 최소값구하기 
//      
//      int[] score = {79,88,91,33,100,55,95};
//      int[] tmp = new int[score.length];
//      for(int i = 0; i<score.length-1; i++){
//         for(int j = i+1; j<score.length; j++){
//            if(score[i]>score[j]){
//                tmp[i] = score[i];
//                score[i] = score[j];
//                score[j] = tmp[i];
//            }
//         }
//      }System.out.println("최소값은" + score[0]);
//      System.out.println("최대값은" + score[score.length-1]);
//      
//      
//      
//
////      문제4
////
////      2차원 배열 arr2에 담긴 모든값의 총합과 평균을 구하는 프로그램을 작성하세요
////
//      int[][] arr2 = {
//          {5,5,5,5,5},
//          {10,10,10,10,10},
//          {20,20,20,20,20},
//          {30,30,30,30,30}
//       };
//      
//      int sum = 0;
//      float avg = 0.0f;
//      
//      for(int i = 0; i < arr2.length; i++){
//         for(int j = 0; j < arr2.length; j++){
//            sum += arr2[i][j];
//         }
//      }avg = sum/(float)(arr2.length);
//      System.out.println(sum);
//      System.out.println(avg);
//      
//
////      문제5
////
////      answer 배열의 각 숫자의 갯수를 세어 count배열에 넣고 
////      count배열의 각숫자만큼씩 *를 출력한다 
//      
//      int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };                     
//      int[] counter = new int[4];                                 
//      for(int i=0; i < answer.length;i++) {                        
//         counter[answer[i] - 1]++;                              
//      }                                                   
//      for(int i=0; i < counter.length;i++) {                        
//         System.out.println(counter[i]);                           
//         for(int j = 0; j < counter[i]; j++){                     
//            System.out.print("*");                              
//         }                                                
//               
//         System.out.println();                                 
//      }
////      
//
//
////      문제6
////
//      String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"}
//      menu배열에서 메뉴이름과 가격중 메뉴이름을 추출하는 프로그램을 작성하세요.
//      
//      
//      String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};
//      
//      for(int i = 0; i < menu.length; i++){
//         String name = menu[i].substring(0, menu[i].indexOf(" "));
//         System.out.println(name);
//      }   
//         
//      
//      
//      
//
////      문제7.
////       
////      
//      str변수에서 Java의 위치를 찾아 출력하는 프로그램을 작성하세요,
//      
//      String str="i Love Java";
//      System.out.println(str.indexOf("J"));
//      
//      
////      문제8
////
//      String  s="java.lang.Object"
//      s변수에서 lang문자열을 추출하는 프로그램을 작성하세요 
//      String  s="java.lang.Object";
//      System.out.println(s.indexOf("l"));            //"l"의 위치를 확인
//      System.out.println(s.indexOf("g"));            //"g"의 위치를 확인
//      System.out.println(s.substring(5,9));         //substring(5,9)
//
//      
////      문제9
////
////      String animals = "dog,cat,bear";
////      animals변수에서 ,를 기준으로  문자열을  분리해서  3개의 단어로 각각 출력하는
////       프로그램을 작성하세요
//      String animals = "dog,cat,bear";
//      String result1 = animals.substring(0,animals.indexOf(','));
//      String result2 = animals.substring(animals.indexOf(',')+1,animals.indexOf(',',5));
//      String result3 = animals.substring(animals.indexOf(',',5)+1,animals.indexOf('r')+1);
//      System.out.println(result1);
//      System.out.println(result2);
//      System.out.println(result3);
//      
////       문제 10
//      String str="java,lang,Object";
//      String result =str.replace(',','.');
//      str문자열에서 ,를 .으로 바꾸어 출력하는 프로그램을 작성하세요.
//      
//      System.out.println(result);
//      
//		
//	}

//}
