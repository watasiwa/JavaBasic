package f_oop2;

import java.util.Vector;

public class Store {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		
		Desktop d = new Desktop();
		System.out.println(d.getInfo());
		
		Product l = new Laptop();
		System.out.println(l.getInfo());
		
		c.buy(d);
		System.out.println("남은돈 :" + c.money + "원 / 포인트 : " + c.point + "점");
	
		c.buy(l);
		System.out.println("남은돈 :" + c.money + "원 / 포인트 : " + c.point + "점");
		c.refund(d);
		c.refund(l);
		c.showItem();
		
	}

}
// 여러가지 물건들이 공통으로 상속받을 수 있는 클래스를 만든다.

class Product{
	int price;
	int point;
	
	//생성자 생성해서 가격과 포인트를 초기화함
	public Product(int price) {
		this.price = price;
		point = price /10;
	}
	
	//상품의 정보를 반환하는 메서드 생성
	String getInfo(){
		return "가격 : " + price + "원 / 포인트: "+point +"점";
	}
	
}

class Desktop extends Product{
	public Desktop() {
		//부모 클래스의 생성자를 호출
		super(1000);
	}
	
	//오버라이딩 메서드
	@Override
	String getInfo(){
		return "Desktop - " + super.getInfo();      // 부모클래스의 메서드를 호출하기위해 super를 사용
	}

	public String toString(){
			return "Desktop";
	}
}


class Laptop extends Product{
	public Laptop() {
		super(2000);
	}
	//오버라이딩 메서드
		@Override
		String getInfo(){
			return "Laptop - " + super.getInfo();      // 부모클래스의 메서드를 호출하기위해 super를 사용
		}
	

		public String toString(){
				return "Laptop";
}
}
class Customer{
	int money = 10000;   //명시적 초기화
	int point = 0;
	
	Vector<Product> item =new Vector<Product>();

	//구매할때 받을 파라미터의 타입을 물건들의 부모클래스를 지정해주면 자식클래스 모두를 받을 수 있다.
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔돈이 부족하네 ㅜㅜ siba것");
			return;
		}
		
		money -= p.price;
		point  += p.point;
		
		item.add(p);
		System.out.println(p + "!! 득템!!");						
	}
	
	//문제1. 환불하는 메서드를 만들어주세요.
	
		void refund(Product p){
			if(item.remove(p)){					//remove-- 내가 가지고있는지 없는지 먼저 확인한다.
				money += p.price;
				point   -= p.point;
				
			System.out.println(p + "이 환불되었습니다.");
			System.out.println("남은돈 :" + money + "원 / 포인트 : " + point + "점");
		
			} 
			else{
				System.out.println("제품을 가지고 있지 않습니다.");
			}
		} 
		

	
	
	void showItem(){
		String items = "아이템 목록 :";
		
		for(Product item : this.item){
			items += " " + item;			
		}
		System.out.println(items);
	}

}