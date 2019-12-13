package e_oop;


public class AirConditioner {
	
	public static void main(String[] args) {
		AirConditioner ac = new AirConditioner();
		ac.power();
		ac.power();ac.power();
		ac.power();
		System.out.println(ac.power);
		
	}
	
	boolean power;//전원
	int temperature; //온도
	int airVolume; // 풍량

	AirConditioner(){
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	//전원 버튼
	
	void power(){
		power = !power;
	}
	
	//온도 + 버튼
	void temperatureUp(){
		if(power && temperature < 30){
			temperature++;
			}
		}
		
	
	//온도 - 버튼
	void temperatureDown(){
		if(power == true){
			if(temperature >= 19){
		temperature--;
				}
			}
		}
	//풍량버튼
	void airVolume(){
		if(power == true){
		if(3 < ++airVolume){
			airVolume = 1;
		}
	}
	}
	//온도가 18~30 까지만 변경할 수 있게 해주시고, 전원을 켯을떄만 버튼들이 작동되도록 메서드들을 변경해 주세요
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
