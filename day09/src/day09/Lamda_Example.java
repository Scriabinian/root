package day09;

public class Lamda_Example {
	public static void main(String[] args) {
		/*
		 * 람다식 ->클래스 메소드 -> action() 이름이 없는 함수; 클래스 메소드 --> 인터페이스 클래스 : 메소드 형식 호출;
		 */
		action4((x, y) -> {
			int result = x + y;
			System.out.println("reuslt : " + result);
			return (double) result;
		});
		action4((x, y) -> {
			int result = x - y;
			System.out.println("reuslt : " + result);
			return (double) result;
		});
		/*
		 * 매개변수ㅡ가 없는 람다식 --> 클래스 인스턴스메소드를 호출(인터페이스) --> 람다식이 구현한다. 사람클래스
		 */
		Person3 person = new Person3();
		/*
		 * 실행문이 두가지가 있는 경우;;
		 */
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니당.");

		});
		/*
		 * 실행문이 한개일 경우 : 중괄호를 생략;
		 */
		person.action(() -> System.out.println("퇴근합니다."));

		/*
		 * 리턴이 있는 람다식;;
		 */
		Person4 person2 = new Person4();

		/*
		 * 람다식에서 처리를 할 때 -->return --> 클래스 반환받는 방식으로 사용한다.
		 */
		person2.action((x, y) -> {
			double result = x + y;
			return result;
		});
		// 실행문이 하나일 경우 리턴을 생략할수 있는;
		person2.action((x, y) -> (x + y));
		// 리턴이 있는 람다식 : 실행문이 하나인경욱 ㅜ현부 처리방법을 -> 클래스 메소드를 통해 해결
		person2.action((x, y) -> sum(x, y));
		/*
		 * 메소드참조(정적메소드/인스턴스메소드);
		 */
		person2.action((x, y) -> Computer2.staticMethod(x, y));
		Computer2 com = new Computer2();
		person2.action((x, y) -> com.instanceMethod(x, y));
		person2.action(com::instanceMethod);
	}

	public static void action4(Calculable calculable) {// 인터페이스 다형성을 매개변수로 받아야 클래스매서드
		int x = 10;
		int y = 4;

		calculable.calculate(x, y);// x,y 선언부.

	}

	public static double sum(double x, double y) {
		return (x + y);
	}
}
