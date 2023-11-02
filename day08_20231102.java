package day7;

import day4.연습ㅎㅎ;

//import day4.연습ㅎㅎ;

/*실행용 클래스 : 메인메소드를 포함한 클래스 파일을 생성하면 만들어짐 ㅎ ㅅㅎ.
*프로그램 실행을 맡고 있는 클래스임.
*/
public class day08_20231102 {
	public static void main(String[] args) {
		
		day4.연습ㅎㅎ a = new day4.연습ㅎㅎ();
		System.out.println(a.Sum(5));
		day7.Car_option c = new Car_option();
		c.ride();
		
		
		Ddfdf d = new Ddfdf();
		d.fff();
		d.i = 0;
		TV tv1 = new TV();TV tv2 = new TV();
		
		tv1.channel = 7;
		tv1.channelDown();//소리가 6으로 줄어든당;;
		System.out.println("tv1 현재 볼륨은 "+ tv1.channel+"립니당");
		System.out.println("tv2 현재 볼륨은 "+ tv2.channel+"립니당");
		tv2 = tv1;
		System.out.println(tv2.channel);
		Jogger j = new Jogger();
	}
	
	static class Ddfdf{
		static int i =0;
	static void fff() {
		System.out.println(i);
	}
	
}
}
class TV{
	int channel;
	void channelDown(){--channel;}
	void channelUp(){++channel;};
	
}

	class Jogger{
		String name;
		void run() {
			System.out.println("달리고있어 ㅎ ㅅㅎ");			
			
		}
}
	



//라이브러리 클래스 : 실행용 클래스는 항상 1개이면서, 별도로 만들어진 클래스당.
