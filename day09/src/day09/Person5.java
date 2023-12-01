package day09;

public class Person5 {
	// 인스턴스메소드 --> Comparable.compare()추상메소드를 묶어서 구현방법을 만든당.
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김길동";
		int result = comparable.compare(a, b);// 인터페이스 호출;;
		if (result < 0) {
			System.out.println(a + "은 " + b + " 보다 앞에 옵니다.");
		} else if (result == 0) {
			System.out.println(a + "은 " + b + "는 같습니당.");
		} else {
			System.out.println(a + "은 " + b + " 보다 뒤에 옵니다.");

		}
	}
}
