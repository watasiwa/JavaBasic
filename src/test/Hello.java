package test;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
	   
		
		
		
		String[] stores = Practice5.stores;
		String[][] items = Practice5.items;
		
		for(int i =0; i < stores.length; i++){
			System.out.println(stores[i] + " : " + Arrays.toString(items));
		}
		
		Practice5 st1 = new Practice5("옷가게");
		Practice5 st2 = new Practice5("신발가게");
		Practice5 st3 = new Practice5("핸드폰가게");
		Practice5 st4 = new Practice5("커피가게");
		
		String[] item = st1.getitem();
		String[] item1 = st2.getitem();
		String[] item2 = st3.getitem();
		String[] item3 = st4.getitem();
		
		System.out.println(Arrays.toString(item));
		System.out.println(Arrays.toString(item1));
		System.out.println(Arrays.toString(item2));
		System.out.println(Arrays.toString(item3));
		
		String [] select = st1.select(new String[]{"가디건", "맨투맨"});
		System.out.println(Arrays.toString(select));
		
		st1.pay(3000);
		
		System.out.println(st1.ceo);
		System.out.println(st2.ceo);
		System.out.println(st3.ceo);
		System.out.println(st4.ceo);
		
		st1.ceo = "진돗개";
		
		System.out.println(st1.ceo);
		}
		
}

