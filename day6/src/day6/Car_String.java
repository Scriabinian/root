package day6;

public class Car_String extends Object {
	private String carName;
	private String company;
	public Car_String(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	public String toString() {
		return "이름 : " +this.carName + " 제조사 : "+company;
	}
	/*
	 * 자동차 이름
	 * 자동차 회사
	 * toString()을 오버라이딩 클래스.toString()-> 차량 이름 : 소나타, 제조사 : 현대;
	 * 인스턴스를 생성할 때 차량 이름과 제조사를 초기화하는 오버로딩을 만든당.
	 */
}
