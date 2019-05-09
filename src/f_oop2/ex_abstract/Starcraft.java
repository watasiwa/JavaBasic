package f_oop2.ex_abstract;

public class Starcraft {

	
}

class Marine{
	int x, y;   //현재 위치를 나타내는 좌표변수
	
	//지정된 위치로 이동하는 메서드
	void move(int x, int y){
		
	}
	
	//현재 위치에서 정지한다.
	void stop(){
		
	}
	
	//스팀팩을 사용한다.
	void stimPack(){
		
	}
	
	
}

class Tank{

	int x, y;
	
	void move(int x, int y){
		
	}
	
	void stop(){
		
	}
	
	//시즈모드로 변환한다.
	void changeMode(){
		
	}
	
	
}

class Dropship extends Unit{
	
	//태우는 메서드
	void load(){
		
	}
	// 내리는 메서드
	void unload(){
		
	}
	@Override
	void move(int x, int y) {
		
	}
	
	
}

// 공통된 변수 및 메서드들을 추상클래스에 설정하고 부모클래스로 정한다음 사용한다. 
//그중 move메서드는 유닛마다 이동방법 다르기때문에 자식클래스에서 오버라이딩한뒤 반드시 구현시켜야한다. 
abstract class Unit{
	int x , y;  // 현재위치				
	
	abstract void move(int x, int y);
	
	void stop(){
		
	}
}















