//package z_exam;
//
//
////	Student 클래스 작성과 실행 
////	 ------연습문제 6-3, 6-4, 6-5 번 다시 해보기-----------
//	public class Student {
//	    //멤버변수 선언 6-3
//		//	    이름, 반, 번호, 국어점수, 영어점수, 수학점수 
//		String name;
//		int ban;
//		int no;
//		int kor;
//		int eng;
//		int math;
//				
//	    //생성자 선언(매개변수 있다) 6-5
//		Student(String name, int bam, int no, int kor, int eng, int math){
//			this.name = name;
//			this.ban = ban;
//			this.no = no;
//			this.kor = kor;
//			this.eng = eng;
//			this.math = math;
//		}
//
//	   //메소드 선언 -getTotal(),  getAverage()
//		int getTotal(){
//			return kor + eng + math;
//		}
//		
//		float getAverage(){
//			return (int)(getTotal()/3f*10+0.5f)/10;
//		}
//		
//	   //메소드 선언 - info()
//		String info(){
//			return name + ","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
//		}
//		
//		
//	}
//	class Test {
//	  public static void main(String args[]) {
//	  
//	     //Student클래스 객체 생성 
//		  Student s = new Student("배미숙 선생님",206,1,100,100,100);
//	     //info메소드를 호출하여 정보출력 
//		  System.out.println(s.info());
//	  }
//	}
////	----------------------------------------------------------------------
////	------연습문제 6-3 6-4 6-5한사람은 할 수 있는 문제-----------------.
////	문제2 
////	Rect 사각형 클래스 작성과 실행
//	public class Rect{
//	  
//	   //멤버변수 선언 -이름 가로길이와 세로 길이를 나타냄 
//	   //name, width, height 
//	   String name;
//	   int width;
//	   int height;
//		
//
//	   
//	  //생성자1- 매개변수 없다
//	  Rect(){
//		   this("사각형", 8, 6);
//	  }
//	  
//	  //생성자2- 매개변수 있다
//	  Rect(String name, int width, int height){
//		  this.name = name;
//		  this.width = width;
//		  this.height = height;
//	  }
//	  
//	  //메소드 - 면적을 구하는 메소드 getArea()
//	  //둘레를 구하는 메소드 getCircum() 
//	  int getArea(){
//		  return width*height;
//	  }
//	  
//	  int getCircum(){
//		  return width*2 + height*2;
//	  }
//	  
//	  // 다음과 같이 정보를 출력하는 메소드 -info()
//	  //이름 : 사각형 
//	  //가로 : 8
//	  // 세로 : 6
//	  //면적 : 48
//	  //둘레  : 28
//	  
//	  String info(){
//		  return ("이름 :" + name +
//				  "가로 :" + width +
//				  "세로 :" + height +
//				  "면적 :" + getArea() +
//				  "둘레 :" + getCircum());
//	  }
//	  
//	  
//	}
//
//class RectTest{
//
//    public static void main(String args[]) {
//       //Rect객체 생성 
//    	Rect r = new Rect();
//      //info메소드를 호출하여 출력 
//    	System.out.println(r.info());
//   }
//}

