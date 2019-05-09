package e_oop;

public class HOMEWORK_PC23 {
	String [] breads = {"튀김소보로", "고구마소보로", "크림빵" , "부추빵","단팥빵" };
	
	 String [] getbreads(){
		 return breads;
	 }
	
	String order(String breadsname){
		boolean flag = false;
		
		for(int i = 0; i < breads.length ; i ++){
			if(breadsname.equals(breads[i])){
				flag = true;
			}
		}
		
		if(flag) {
			return "여기" +" " + breadsname + " " + "나왔습니다." ;
			} 
		else{
			System.out.println(breadsname + "? 그런거 없습니다.");
			return null;
		}
		
	}
	
	void pay(int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히가세요");
		}
	}
}
