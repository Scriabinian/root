package Scriabinian;

public class A4 {
	//지역 클래스 : 생성자 또는 메서드 안에다 내부 클래스 만든다.
	//메서드 내부 클래스 작성해서 호출하는 방법
		A4(){
			class B{//내부 클래스;;
				B(){//내부 생성자;;
					System.out.println("B-생성자실행");
				}
				void method1(){
					System.out.println("B-method1()");
				}
			}
			B b = new B();
			b.method1();
		}
	void UseB(int arg){
		int var = 2;
		
		class B{//내부 클래스;;
			B(){//내부 생성자;;
				System.out.println("B-생성자실행");
			}
			void method1(){
				System.out.println("B-method1()");
				System.out.println(var);
				System.out.println(arg);
				//var = 3;
				//var = 2;
			}
		}
		B b = new B();
		b.method1();
		
	}
	
	public static void main(String[] args) {
		A4 a = new A4();
	}	
}
