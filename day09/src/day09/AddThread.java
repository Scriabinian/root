package day09;

public class AddThread implements Runnable {
	// 클래스 변수를 선언
	private Bank b;
	private String name;

	public AddThread(String name, Bank b) {
		this.name = name;
		this.b = b;
	}

	@Override
	public void run() {
		synchronized (b) {
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					b.addMoney(1000);
					System.out.println(this.name + " 현재 잔고" + b.getMoney());
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
}
