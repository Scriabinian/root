package day7;
class Bus{
	void take(int m) {
		while(true) {
			if(m<3000) {
				System.out.println("교통카드 충전하러 갑니당.");
				return;
			}
			System.out.println("버스를 탑니다.");
			m -= 1250;
		}
		
		
	}
}
public class ebyreturn {
	
	public static void main(String[] args) {
		int money = 10000;
		Bus bus = new Bus();
		bus.take(money);

	}

	
}
