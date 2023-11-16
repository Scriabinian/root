package Scriabinian;

public class A1 {
	int filled;
	B filled2;
	void method() {
		System.out.println("methodA1()실행");
	}
	class B{
		B(){
			
		}
		void method() {
			System.out.println("methodB()실행");
		}
	}
	A1(){
		B b = new B();
		b.method();
	}
	
}

