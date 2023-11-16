package Scriabinian;

public class A3 {
	private int val;
	private static int cnt =  1;
	static class B3{
		int cnt = A3.cnt;
		B3 filled1 = new B3();
		static B3 filled2 = new B3();
		
		//int val2 = val;
		void methodB() {
			System.out.println("methodB 실행 ㅎ ㅅㅎ");
		}
	}//인스턴스 필드값으로  B 객체 대입.
	A3(){
		B3 filled1 = new B3();
	}
	void method1() {
		B3 filled1 = new B3();//외부 클래스 A3를 통해서 인스턴스 메서드를 활용한 B3내부클래스 접근가능.
	}
	static void method2(){
		B3 filled1 = new B3();//외부 클래스 A3를 통해서 정적 메서드를 활용한 B3내부클래스 접근가능.
	}
}
