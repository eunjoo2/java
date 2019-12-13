package e_oop;

import java.util.Scanner;

public class Tv {
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.power();
		
		System.out.println(tv.channel);
	}
		//전원, 채널, 음량
	
	boolean power;//전원
	boolean mute;
	int channel; // 채널
	int Volume; // 음량
	
	Tv(){
		power = false;
		channel = 01;
		Volume = 10;
	}
	
	//전원버튼
	void power(){
		power = !power;
	}
	//음소거
	void mute(){
		mute = !mute;
	}
	//채널
	
	void channelUp(){
		if(power && channel <= 300){
			channel++;
			 if(300 < channel){
				channel = 0;
			}
		}
	}
	void channelDown(){
		if(power && channel >= 00){
			channel--;
			 if(0 > channel){
				channel = 300;
			}
		}
	}
	void channelanswer(){
		if(power == true){
		Scanner scanner = new Scanner(System.in);
		System.out.println( "채널를 입력해주세요.");
		String channelanswer = scanner.nextLine();
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		channel = num;
		
			}
	}	
	//볼륨
	void VolumeUp(){
		if(power == true){
			if(Volume <= 99){
				Volume--;
				}
			}
	}
	void VolumeDown(){
		if(power == true){
			if(Volume >= 0){
				Volume--;
				}
			}
		}
	
}
