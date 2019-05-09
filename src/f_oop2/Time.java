package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		int temp = this.hour + hour;
		this.hour = temp%24;

	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		int temp = this.minute+ minute;
		this.minute = temp%60;
		if((temp)/60 >= 1){
			setHour((temp)/60);
	}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
	
		int temp = this.second+ second;
		this.second = temp%60;
		if((temp)/60 >= 1){
			setMinute((temp)/60);	
		}
	}
	@Override
	public String toString() {
		System.out.printf("%02d:%02d:%02d\n", hour, minute,second);
		return  " ";
	}
	
	
	/*
	 *시간
	 * this.hour + hour;
	 * this.hour = (this.hour + hour)%24;
	 * 
	 * 
	 * 
	 * 분
	 * 	this.minute + minute;		
	 * this.minute = (this.minute + minute)%60;					구하려는 분은 입력값을 60으로 나눈 값의 나머지가 분으로 입력되게 만들었다.
	 * if((this.minute + minute)/60 >= 1){							만약 입력값을 60으로 나눈 값이 1보다 크면 
	 * 		setHour((this.minute + minute)/60);					sethour을 호출하여 나눈값을 시간에 +나눈값되게 올려보낸다
	 * 	}
	 * 
	 * 초
	 *	 this.second + second;
	 *	 this.second = (this.second + second)%60;				구하려는 초는 입력값을60으로 나눈값의 나머지가 초로 입력된다.	  
	 *	if((this.second + second)/60 >= 1){						만약 입력값을 60으로 나눈값이 1보다 크면
	 *		setMinute((this.second + second)/60);				setMinute을 호출하여 나눈값을 분에 +나눈값되게 올려보낸다.
	 *	}
	 *
	 *
	 *유효성 검사 
	 *
	 *
	 *if(minute > 60{
	 *
	 *
	 *
	 *
	 * if(second > 60){
	 * 		this.second = 0;
	 * } else if( second< 0){
	 * 		this.second = 0;
	 * }else{
	 * 		this.second = second;
	 *}
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */
}



