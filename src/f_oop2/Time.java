package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	//잘못된 값을 입력하는 걸 막기 위해  : 유효성 체크
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		
		if(hour < 0){
			this.hour = 0;
		}else{
			this.hour = hour % 24;
		}
		
	}
//		if(0 <= hour && hour <=23){
//			this.hour = hour;
//		}else{
//			System.out.println("입력이 잘못되었습니다.");
//		}
//	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		if(minute < 0){
			this.minute = 0;
			
			}else{
				setHour(this.hour + minute /60);
				this.minute = minute % 60;
			}
		
//		if(0 <= minute && minute <= 59){
//			this.minute =minute;
//		}else{
//			System.out.println("입력이 잘못되었습니다.");
//		
//		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
//		if(second <0){
//			this.second = 0;
//		}else if(59 <second){
//			this.second = 59;
//		}else{
//			this.second = second;
//		}
//		
	
		if(second < 0){
			this.second = 0;
			}else{
				setMinute(this.minute + second / 60);
				this.second = second % 60;
			}
		
		
	
	}
	
	//Object 클래스로부터 상속받은 메서드
	@Override
	public String toString(){
		return hour + ":" + minute + ":" + second ;
	}
	

}
