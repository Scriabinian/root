package day09;

public interface Calculable {
	double calculate(int x, int y);
}

interface Workable {
	void work();
}

class Person3 {
	public void action(Workable workable) {
		workable.work();
	}
}

class Person4 {
	public void action(Calculable calculable) {
		double result = calculable.calculate(10, 4);
		System.out.println(result);
	}
}

class Computer2 {
	/*
	 * 클래스 : 인스턴스/클래스 메소드를 사용하는 방법으로 만든다. 인스턴스 메소드
	 * 
	 * 클래스 메소드
	 */
	public double instanceMethod(double x, double y) {
		return x + y;
	}

	public static double staticMethod(double x, double y) {
		return x + y;
	}
}