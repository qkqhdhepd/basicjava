package c_statement;
import java.util.*;
public class SimLiTest {

	public static void main(String[] args) {
		String x1 = null;
		String x2 = null;
		String x3 = null;
		String x4 = null;
		String x5 = null;
		String x6 = null;
		String x7 = null;
		String x8 = null;
		String x9 = null;
		String y1 = null;
		String y2 = null;
		String y3 = null;
		String y4 = null;
		String y5 = null;
		String y6 = null;
		String y7 = null;
		String y8 = null;
		Scanner s = new Scanner(System.in);
		System.out.println("이 프로그램은 나의 연애 유형을 알아보는 프로그램입니다.");
		System.out.println("해당 질문을 읽고 Y 또는 N를 입력하세요.");
		System.out.println("나는 금사빠다.(금방 사랑에 빠진다.)");
		x1 = s.nextLine();
		if(x1.equals("Y")){
			System.out.println("연애할 때 끌려다니는 타입이다.");//2번
			x2 = s.nextLine();
			if(x2.equals("Y")){
				System.out.println("감정표현에 솔직한 편이다.");
				x5 = s.nextLine();//5번
				if(x5.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					x7 = s.nextLine();
					if(x7.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						x9 = s.nextLine();
						if(x9.equals("Y")){
							System.out.println("당신의 연애유형은 D타입 입니다.");
							System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
						}else{
							System.out.println("당신의 연애유형은 C타입 입니다.");
							System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
						}
					}else{
						System.out.println("당신의 연애유형은 B타입 입니다.");
						System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
					}
				}
			}else{
				System.out.println("데이트 코스는 미리 짜는게 편하다.");
				x3 = s.nextLine();
				if(x3.equals("Y")){
					System.out.println("활동적인 데이트가 좋다.");
					x6 = s.nextLine();
					if(x6.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
						x7 = s.nextLine();
						if(x7.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							x9 = s.nextLine();
							if(x9.equals("Y")){
								System.out.println("당신의 연애유형은 D타입 입니다.");
								System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
							}else{
								System.out.println("당신의 연애유형은 C타입 입니다.");
								System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
							}
						}else{
							System.out.println("당신의 연애유형은 B타입 입니다.");
							System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
						}
					}
				}else{
					System.out.println("감정표현에 솔직한 편이다.");
					x5 = s.nextLine();//5번
					if(x5.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
						x7 = s.nextLine();
						if(x7.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							x9 = s.nextLine();
							if(x9.equals("Y")){
								System.out.println("당신의 연애유형은 D타입 입니다.");
								System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
							}else{
								System.out.println("당신의 연애유형은 C타입 입니다.");
								System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
							}
						}else{
							System.out.println("당신의 연애유형은 B타입 입니다.");
							System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
						}
					}else{
						System.out.println("활동적인 데이트가 좋다.");
						x6 = s.nextLine();
						if(x6.equals("Y")){
							System.out.println("이성친구는 존재할 수 없다.");
							x7 = s.nextLine();
							if(x7.equals("Y")){
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
								x9 = s.nextLine();
								if(x9.equals("Y")){
									System.out.println("당신의 연애유형은 D타입 입니다.");
									System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
								}else{
									System.out.println("당신의 연애유형은 C타입 입니다.");
									System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
								}
							}else{
								System.out.println("당신의 연애유형은 B타입 입니다.");
								System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
							}
						}
					}
				}
			}
		}else{
			System.out.println("감정기복이 크지 않다.");
			x4 = s.nextLine();
			if(x4.equals("Y")){
				System.out.println("연락이 없어도 믿고 기다리는 편이다.");
				x8 = s.nextLine();
				if(x8.equals("Y")){
					System.out.println("당신의 연애유형은 A타입 입니다.");
					System.out.println("A타입은 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입");//끝
				}else{
					System.out.println("이성친구는 존재할 수 없다.");
					x7 = s.nextLine();
					if(x7.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						x9 = s.nextLine();
						if(x9.equals("Y")){
							System.out.println("당신의 연애유형은 D타입 입니다.");
							System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
						}else{
							System.out.println("당신의 연애유형은 C타입 입니다.");
							System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
						}
					}else{
						System.out.println("당신의 연애유형은 B타입 입니다.");
						System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
					}
				}
			}else{
				System.out.println("감정표현에 솔직한 편이다.");
				x5 = s.nextLine();//5번
				if(x5.equals("Y")){
					System.out.println("이성친구는 존재할 수 없다.");
					x7 = s.nextLine();
					if(x7.equals("Y")){
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						x9 = s.nextLine();
						if(x9.equals("Y")){
							System.out.println("당신의 연애유형은 D타입 입니다.");
							System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
						}else{
							System.out.println("당신의 연애유형은 C타입 입니다.");
							System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
						}
					}else{
						System.out.println("당신의 연애유형은 B타입 입니다.");
						System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
					}
				}else{
					System.out.println("활동적인 데이트가 좋다.");
					x6 = s.nextLine();
					if(x6.equals("Y")){
						System.out.println("이성친구는 존재할 수 없다.");
						x7 = s.nextLine();
						if(x7.equals("Y")){
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							x9 = s.nextLine();
							if(x9.equals("Y")){
								System.out.println("당신의 연애유형은 D타입 입니다.");
								System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
							}else{
								System.out.println("당신의 연애유형은 C타입 입니다.");
								System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
							}
						}else{
							System.out.println("당신의 연애유형은 B타입 입니다.");
							System.out.println("B타입은 구속을 하는 것도 받는 것도 싫은 자유로운 연애를 하는 타입");//끝
						}
					}else{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						x9 = s.nextLine();
						if(x9.equals("Y")){
							System.out.println("당신의 연애유형은 D타입 입니다.");
							System.out.println("D타입은 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입");//끝
						}else{
							System.out.println("당신의 연애유형은 C타입 입니다.");
							System.out.println("C타입은 이것은 의리인가 사랑인가-친구같이 편안한 연애를 하는 타입");//끝
						}
					}
				}
			}
		}

	}

}
		
		
		
		

