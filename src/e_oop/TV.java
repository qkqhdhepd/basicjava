package e_oop;

public class TV {
	
	
	//TV와 최대한 비슷하게 TV클래스를 만들어주세요.
	boolean power;
	int sound;
	int channel;
	
	int[] star = new int[]{7,10,22,100};
	int[] starchannel = new int[star.length];
	
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	final int MAX_SOUND = 30;
	final int MIN_SOUND = 0;
	
	{
		power = false;
		sound = 10;
		channel = 1;
	}
	
	void power(){
		power = !power;
	}
	
	void soundUp(){
		if(power && sound < MAX_SOUND){
			sound++;
		}
	}
	
	void soundDown(){
		if(power && sound < MAX_SOUND){
			sound--;
		}	
	}
	
	void channelUp(){
		if(power ==true){
			if(MAX_CHANNEL < ++channel){
				channel = MIN_CHANNEL;
			}
		
		}
	}
	
	void channelDown(){
		if(power ==true){
			if(MIN_CHANNEL > --channel){
				channel = MAX_CHANNEL;
			}
		
		}
	}
	
	void star(){
		if(power ==true){
			for(int i = 0; i < star.length; i++){
				starchannel[i] = star[i];
				if(starchannel[i] < star[i+1]){
					
				}
				
			}
		}
	}
	
	
//	sem TV
	//TV와 최대한 비슷하게 TV클래스를 만들어주세요.
//		boolean power;
//		int channel;
//		int volume;
//		
//		final int MIN_CHANNEL = 1;
//		final int MAX_CHANNEL = 100;
//		final int MIN_VOLUME = 0;
//		final int MAX_VOLUME = 10;
//		
//		TV(){
//			power = false;
//			channel = 1;
//			volume = 5;
//		}
//		
//		void power(){
//			power = !power;
//			System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
//		}
//		
//		void changeChannel(int channel){
//			if(power){
//				if(MIN_CHANNEL <= channel && channel <= MAX_CHANNEL){
//					this.channel = channel;
//				}
//				System.out.println("채널. " + this.channel);
//			}
//		}
//		
//		void channelUp(){
//			changeChannel(channel + 1);
//		}
//		
//		void channelDown(){
//			changeChannel(channel - 1);
//		}
//		
//		void volumeUp(){
//			if(power){
//				if(volume < MAX_VOLUME){
//					volume++;
//				}
//				showVolume(volume);
//			}
//		}
//		
//		void volumeDown(){
//			if(power){
//				if(MIN_VOLUME < volume){
//					volume--;
//				}
//				showVolume(volume);
//			}
//		}
//		
//		void showVolume(int volume){
//			System.out.print("음량.");
//			for(int i = MIN_VOLUME + 1; i <= MAX_VOLUME; i++){
//				if(i <= volume){
//					System.out.print("■");
//				}else{
//					System.out.print("□");
//				}
//			}
//			System.out.println();
//		}
//		
//		public static void main(String[] args) {
//			TV tv = new TV();
//			tv.power();
//			tv.channelUp();
//			tv.channelDown();
//			tv.volumeUp();
//			tv.volumeDown();
//		}
		
	
	
	
	
}
