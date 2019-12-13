
class MyTv{
		boolean isPowerOn;
		int channel;
		int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		
		void turnOnOff() {
			isPowerOn = !isPowerOn;
		}
		void volumeUp() {
				if(isPowerOn == true){
					if(MAX_VOLUME != 100){
						volume++;
						}
					}
			}
		
	
		void volumeDown() {
			{
				if(isPowerOn == true){
					if(MIN_VOLUME != 100){
						volume--;
						}
					}
			}
		}
		void channelUp() {
			
				if(isPowerOn && channel <= 100){
					channel++;
				}else if(100 < channel){
						 MIN_CHANNEL= 1;
					}
				}
			
		
		void channelDown() {
			
				if( isPowerOn && channel >= 1){
					channel--;
				}else if(0 <= channel){
					MAX_CHANNEL= 100;
					}
				}
		}
		class Exercise6 {
		public static void main(String args[]) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		}
		}