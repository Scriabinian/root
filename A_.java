package Scriabinian;

public class A_ {
	public static void main(String[] args) { 
		
		A1 a = new A1();
		a.filled = 10;
		A1.B b = a.new B();
		A3.B3 b2 = new A3.B3();
		b2.methodB();//독립적이라서 직접 객체를 생성하고 메서드를 호출할 수 있당.ㅎ ㅅㅎ
		//PrintOut이라는 외부 클래스 안에 Out이라는 내부 클래스를 직접적으로 호출한다.
		String str = "정적 내부 클래스 테스트";
		//외부 객체를 선언하고 인스턴스를 활용해서 메서드를 호출한당.
		PrintOut.Out o = new PrintOut.Out();
		o.println(str);
		Scriabinian.PrintOut.Out out = new Scriabinian.PrintOut.Out();
		A4 a2 = new A4();//A4라는 외부 클래스 인스턴스 생성함.
		a2.UseB(3);//ㅎ ㅅㅎ;;
		// 내부 클래스지만 private접근 제한 사용중;
		PermitExample permit = new PermitExample();
		//permit.getInnerClass().print();
		/*
		 * 중첩 내부 클래스를 활용한 인터페이스 객체 주입 방법;
		 * Button 객체 생성.
		 */
		Button btnOk = new Button();
		class OkListener implements Button.OnClickListener{

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니당 ㅎ ㅅㅎ");
			}
			
		}
		btnOk.SetOnClickListener(new OkListener());//Ok버튼을 클릭하는 객체를 주입해서 만든당...
		btnOk.click();//메서드를 호출해서 확인하장 ㅎ ㅅㅎ.
		
	}	
}
class PrintOut{
	//정적내부클래스 선언;;
	static class Out {
		//메서드를 활용해서 만든당 ㅎ ㅅㅎ.
		void println(String str) {//str매개변수 받아서 출력함 ㅎ ㅅㅎ.
			System.out.println(str);
		}
	}
}

/*2.멤버 클래스 접근 제한자(private);
 * 내부 클래스 private써서 외부 클래스 메서드를 통해서 클래스 접근할수 있게 만든다. 
 */
class PermitExample{
	public InnerClass getInnerClass() {//InnerClass : 리턴값 = 객체(다형성);
		return new InnerClass();
	}
	
	private class InnerClass{//private : 내부 클래스를 통해서 접근 가능.
		public void print() {
			System.out.println("접근을 private로 제한합니다.");		
		}
	}
}