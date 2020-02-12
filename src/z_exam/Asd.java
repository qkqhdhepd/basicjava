package z_exam;

public class Asd {
	
		static int abs(int value){
			final int c = -1;
			int result = 0;
			if(value < 0){
				result = value * c;
			}else{
				result = value;
			}
			return result;
		}
		
		public static void main(String[] args){
			int value = 5;
			System.out.println(value+"의 절대값 :"+abs(value)); 
			value = -10;
			System.out.println(value+"의 절대값 :"+abs(value)); 
		}
	}
