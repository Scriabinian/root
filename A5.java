package Scriabinian;

public class A5 {
	//문제1 : 외부 클래스의 멤버 접근 제한 : 정적/인스턴스 비교 ㅎ ㅅㅎ.
	//인스턴스 필드와 메서드 ㅎ ㅅㅎ
	//정적 필드와 메서드.
	int filled1;
	void method1() {
		System.out.println("1");
		
	}
	static int filled2;
	static void method2() {
		System.out.println("2");
	}
	
	class B{//인스턴스 멤버 클래스 ㅎ ㅅㅎ.
		//메서드 호출 ㅎ ㅅㅎ
		void method() {//인스턴스 멤버 클래스 :  인스턴스 정적 메소드와 필드 모두 허용;
			filled1 = 10;
			method1();
			filled2 = 20;
			method2();
			//A5인스턴스 필드와 메서드
			//A5정적ㄷ 필드와 메서드.
		}
	}
	static class C{//정적 멤버 클래스 ㅎ ㅅㅎ.
		//메서드 호출 ㅎ ㅅㅎ
		void method() {
			//A5 인스턴스 필드와 메서드 허용 되지 않는당 ㅎ ㅅㅎ.
			//static 정적(method area)는 객체가 없어도 사용하기 때문에 객체가 생성되지 않아도 사용할 수 있는 상태라서 에러가 발생할 수 있당.
			//filled1 = 10;
			//method1();
			filled2 = 20;
			method2();
		}
	}
}
