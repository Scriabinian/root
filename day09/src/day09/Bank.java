package day09;

public class Bank {// 은행 크래스
	private int money;

	public synchronized int getMoney() {// 돈 확인
		return money;
	}

	public /*synchronized*/ void addMoney(int money) {// 돈 립금;
		this.money += money;
	}

}
