package e_oop;

public class TV {
		private String name;                					   //tv이름 지정
		private boolean power;								  // 전원상태	
		private int channel;									  // 채널
		private int volume;										  // 볼륨	
		
		
		{
			name = "울트라FHDTV";
			channel = 13;
			volume = 6;
		}
		
		void name(){
			System.out.println("지금 사용하는 제품은 " + name + "입니다.");
			System.out.println("지금 시청하고있는 채널은" + this.channel + " 번 입니다");
			System.out.println("현재 볼륨은" + this.volume + "입니다.");
		}
		
		
		
		void power(){
			this.power =! this.power;
			
			if(this.power){
				System.out.println("ON");
			}else if ( !this.power){
				System.out.println("OFF");
			}
		
		}
		
			
				
		void channelup(){
			
			
			if(1 < this.channel && this.channel< 100){
				this.channel ++;
				System.out.println(this.channel + "번으로 변경되었습니다.");
			}else{
				System.out.println("더이상 올릴 수 없습니다");
			}
		}	
		
		void channeldown(){
			
			if(this.channel < 100){
				this.channel--;
				System.out.println(this.channel + "번으로 변경되었습니다.");
			} 
		}
		
		void channelchange(int i){
			if(0 < this.channel && this.channel < 100){
				this.channel = i;
				System.out.println(this.channel + "번으로 변경되었습니다.");
			}else{
				System.out.println("번호가 없습니다.");
			}
		}
 		
		
		
		void volumeup(){
			
			if(1< this.volume && this.volume < 30){
				this.volume++;
				System.out.println("음량이" +this.volume + "로 올라감~");
			} else{
				System.out.println("더이상 올릴 수 없습니다");
			}
		}
		
		void volumedown(){

			if( 30 > this.volume){
				this.volume--;
				System.out.println("음량이" + this.volume + "로 내려감~");
			} 
		}


		/*
		 * private final int CHANNEL_MIN;
		 * private final int CHANNEL_MAX; 
		 * private final int VOLUME_MIN;
		 * private final int VOLUME_MAN;
		 * 
		 * {		CHANNEL_MIN = 1;
		 * 			CHANNEL_MAX = 200;
		 * 			VOLUME_MIN = 0;
		 * 			VOLUME_MAX = 10;
		 * }
		 * 
		 * 
		 * 
		 * TV(String name){
		 * 		this.name = name;
		 * 		power = false;
		 * 		channel = 1;
		 * 		volume = 5;
		 * }
		 *
		 *void power(){
		 *	power = !power;
		 *		printState();
		 * }
		 * 
		 * void printState(){
		 *  system.out.println(name + "의 상태(전원 : " + power
		 *  						+ " / 채널 : " + channel + " / 음량 : " + volume + ");
		 * 	}
		 * 
		 * 	 void changechannel(int channel){
		 * 		if(CHANNEL_MIN <= channel && channel <= CHANNEL_MAX){
		 * 			this.channel = channel;
		 * 	}
		 * 	printState();
		 * }
		 * 
		 * 	 void channelup(){
		 * 			changechanel(channel + 1);
		 *   }
		 *  } 
		 * 
		 *   void channeldown(){
		 * 			changechanel(channel - 1);
		 *   }
		 * }
		 *	
		 *   void volumeup(){
		 *			if(volume < VOLEUM_MAX){
		 *				volume++; 
		 *   }
		 *   printState();
		 *   }
		 * 
		 *   void volumedown(){
		 *			if(volume < VOLEUM_MIN){
		 *				volume--; 
		 *   }
		 *      printState();
		 * } 
		 *   
		 *   
		 *   
		 *   
		 *   
		 *   
		 *    */


}									  					
