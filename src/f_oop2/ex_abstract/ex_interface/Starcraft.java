package f_oop2.ex_abstract.ex_interface;

public class Starcraft {

	public static void main(String[] args) {
			SCV scv = new SCV();
			scv.repair(new Tank());
	}

}


class Unit{
	int hp;				// 현재체력
	final int MAX_HP;	// 최대 체력
	
	public Unit(int hp) {
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{
	public Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	public Tank() {
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	public Dropship() {
		super(125);
	}
}

class SCV extends Unit{
	public SCV() {
		super(60);		
	}
	
	void repair(Repairable r){
		// Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		//그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		// hp를 멤버로 가진 Unit으로 형변환을 해줘야 한다.
		if(r instanceof Unit){		// r이 유닛클래스의 인스턴스인지 확인하는 로직
			Unit u = (Unit) r;		// r을 유닛으로 형변환시킨것
		
			while(u.hp < u.MAX_HP){
					u.hp++;
			}
		}
	}
}

interface Repairable{
	
}