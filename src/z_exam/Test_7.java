package z_exam;
//package z_exam;
//
//public class Test_6_02 {
//	
//}
////	Product 클래스 
////
//	class Product{
//		String name;                           				//변수선언  :   상품명 , 가격 
//		int price;
//		
//		Product(String name, int price){					//생성자 :매개변수 있다 
//			this.name = name;
//			this.price = price;
//		}
//		
//		void info(){										//메소드 : void  info()  상품명과 가격을 출력하는 메소드 
//			System.out.println("상품명: "+name);
//			System.out.println("금  액 : "+price + "원");	
//		}
//	}
//
//
//	
//	class Desktop extends Product{							//Desktop 클래스 - Porduct를 상속 받는다 	
//		Desktop() {											//생성자 - 매개변수 없다	 
//			super("삼성 컴퓨터", 5000000);						
//		}	
//	}
//		
//	class TV extends Product{								//상속받은 부모 클래스  Product클래스의 생성자를 호출한다
//		
//		
//		
//		TV(){												//생성자 - 매개변수 없다
//			super("LG TV", 100000000);		
//		}
//	}
//	
//	class Customer{											//상속받은 부모 클래스  Product클래스의 생성자를 호출한다   
//				
//		int money = 999999999;								//변수선언 : 현재가지고 있는 돈  money 
//		Product[] item = new Product[10];					//Product 배열  -   사는 물건을 저장 한다 , 장바구니 
//				
//		void buy(Product p){								//물건을 사기 위한 메서드
//			if(money < p.price){							//현재의 돈이  물건의 가격보다 적으면 물건을 못사요 
//				System.out.println("돈이 부족합니다.");				
//				return;										
//			}
//			
//			money -= p.price;									//샀으면 현재의 돈에서 물건의 가격값을 빼줌 	 
//			
//			for(int i = 0; i < item.length; i++){				//배열(장바구님)에 산 물건을 저장		
//				if(item[i] == null){									
//					item[i] = p;
//					break;
//				}
//			}
//			System.out.println(p.name + "을 구매했습니다.");		//산 물건의 이름을 출력한다
//		}
//		
//		
//		//장바구니를 보기 위한 메서드
//		void showItem(){
//			for(int i = 0; i < item.length; i++){							
//				if(item[i] != null){										
//					System.out.println(i + 1 + "." + item[i].name);			
//				}
//			}
//			System.out.println();
//		}
//		
//	}
//	
//	
//	public class Store {
//		
//		public static void main(String[] args) {
//			
//			Customer c = new Customer();		
//			Product p = new Desktop();			
//			
//			p.info();							
//			c.buy(p);							
//			
//			p = new TV();						
//			p.info();							
//			c.buy(p);							
//			
//			
//			c.showItem();						
//		}
//	}







