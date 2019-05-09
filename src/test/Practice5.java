package test;

public class Practice5 {
	
	static String ceo = "한상호";
	static String[] stores;
	static String[][] items;
	 String[] item;
	
	static{
		stores = new String[] { "옷가게", "신발가게", "핸드폰가게", "커피가게"};
		items = new String[4][0];	
		items[0] = new String[] {"맨투맨", "라운드", "후드티", "가디건", "바지"};
		items[1] = new String[] {"로퍼", "운동화", "러닝화", " 샌들","슬립온","구두"};
		items[2] = new String[] {"갤럭시 시리즈", "아이폰 시리즈","lg폰","학생폰"};
		items[3] = new String[] {"아메리카노", " 카페라떼", "에이드","카페모카"};
	}
	
	Practice5(String name){
		if(name.equals("옷가게")){
			item = items[0];
		}else if(name.equals("신발가게")){
			item = items[1];
		}else if (name.equals("핸드폰가게")){
			item = items[2];
		}else if (name.equals("커피가게")){
			item = items[3];
		}
	}
	Practice5(){
		this("옷가게");
	}
	String[] getitem(){
		return item;
	}

	String Select(String item){
			boolean flag = false;
			
			for(int i = 0; i < this.item.length; i++){
				if(item.equals( this.item[i])){
					flag = true;
				}
			}
			if(flag){
				return "여기요" + item ;
			}else{
				System.out.println(item + "? 그런거 없습니다");
				return null;
			}
	}
	
	String [] select(String[] item){
		boolean[] flag = new boolean[item.length];
		String[] rtnitem = new String[item.length];
		
		for(int i =0; i < item.length; i++){
			for(int j = 0; j < this.item.length; j++){
				if(item[i].equals(this.item[j])){
					flag[i] = true;
				}
			}
		}
			
		for(int i = 0 ; i < flag.length; i++){
			if(flag[i]){
				rtnitem[i] = "여기" + item[i] + "있습니다."; 
			}else{
				System.out.println(item[i] + "? 그런거 안팔아요");
			}
		}	
		return rtnitem;
	}
	
	
	
	void pay(int money){
		if(money > 0){
			System.out.println("감사합니다. 안녕히가세요");
		}
	}
	
}
	
	

