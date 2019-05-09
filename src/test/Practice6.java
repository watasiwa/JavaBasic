package test;

public class Practice6 {

		String name;
		int number;
		
		public void Car(String name){
			this.name = name;
					}
		
		//오버로딩
		public int plus(int x, int y){
			return x+y;
		}
	
		public int plus(int x, int y, int z){
			return x+y+z;
		}
	
		public String plus(String x, String y){
			return x +y;
		}
	
		//생성자 오버로딩 
		

	
	public static void main(String[] args) {
		/*//String str = new String("hello");
		 * 
		 
		String str = "hello";
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,7));
		*/
		
		Practice6 p = new Practice6();
		Practice6 p1 = new Practice6();

		
		System.out.println(p.plus(4, 5));
		System.out.println(p.plus(4, 7, 9));
		System.out.println(p.plus("힝", "힝"));
		
		
		
		
		
		
	}
	public class Car {
	    String name;
	    int number;

	    Car(String name, int number) {
	        this.name = name;
	        this.number = number;
	    }
	    public Car(){
	        this("이름없음",0);
	    }
	    public Car(String name){
	        this("name",0);
	        
	    }
	}
}
