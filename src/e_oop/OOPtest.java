package e_oop;

public class OOPtest {

	public static void main(String[] args) {
		//문제1. tv라는 클래스를 생성해  전원상태, 채널, 음량을
		//변경하는 메서드를 만들어주세요. (생성시 tv이름 지정)
		
		//문제2. tv클래스를 사용해서 두대의 tv를 생성하고,
		// 두대의 채널과 음량 상태를 각각 3번 이상씩 변경해주세요.

		
		
		TV test = new TV();
		TV test1 = new TV();
		test.power();
		test.name();
		test.channelchange(7);
		test.channelup();
		test.channelup();
		test.channelup();
		
		test.channeldown();
		test.channeldown();
		test.channeldown();
		
		test.volumeup();
		test.volumeup();
		test.volumeup();
		
		test.volumedown();
		test.volumedown();
		test.volumedown();
		test.power();
		
		test1.name();
		test1.power();
		test1.channelchange(60);
		test1.channeldown();
		test1.channeldown();
		test1.channeldown();
		
		test1.channelup();
		test1.channelup();
		test1.channelup();
		
		test1.volumedown();
		test1.volumedown();
		test1.volumedown();
		
		test1.volumeup();
		test1.volumeup();
		test1.volumeup();
		test1.power();
	}
}

