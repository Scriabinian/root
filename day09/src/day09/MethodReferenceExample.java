package day09;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// (a,b)->a.compareIgnoreCase(b)
		Person5 person = new Person5();
		// 클래스 안에 인스턴스를 호출해서, 인터페이스 다형성을 받는당.
		// 람다식으로 구현;;
		person.ordering((a, b) -> {
			return a.compareToIgnoreCase(b);
		});
		// 리턴이 없는 람ㄷ자식 : 실행문이 한개일 경우 return;
		person.ordering((a, b) -> a.compareToIgnoreCase(b));
		// 인터페이스 매개변수
		person.ordering(String::compareToIgnoreCase);
		// 인터페이스 객체 선언시 람다식을 이용해 함수를 구현하는 방법;
		CompareNumber compare = (num01, num02) -> {
			return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
		};
		int num01 = 10;
		int num02 = 20;
		int result = compare.compareTo(num01, num02);
		if (result > 0) {
			System.out.println("num01이 num02보다 크당");
		} else if (result < 0) {
			System.out.println("num01이 num02보다 작당");
		} else {
			System.out.println("num01이 num02와 같당");
		}

	}

}
