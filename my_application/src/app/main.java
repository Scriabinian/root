package app;
import pack1.A;
import pack2.B;

public class main {
	public static void main(String[] args) {
		/*
		 * pack1 > A.java->method() -> A-method 실행
		 * pack2 > b.java->method() -> B-method 실행
		 */
		A a = new A();
		B b = new B();
		a.method();
		b.method();
		
	}
}
