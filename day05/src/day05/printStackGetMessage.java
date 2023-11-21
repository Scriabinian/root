package day05;

public class printStackGetMessage extends Throwable {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3);
		System.out.println(0/0);
		}catch(ArithmeticException e){
			//메서드의 정보와 메시지가 출력됨.
			e.printStackTrace();
			System.out.println("예외 메시지 "+e.getMessage());//저장된 메시지를 얻어와 출력;
			/*
			 * 예외처리 클래스를 생성해서 해당 메서드를 호출하는것.
			 */
		}
		System.out.println(6);
		
		/*
		 * ArithmeticException 인스턴스 : 예외처리 클래스 호출되면서 인스턴스 실행.
		 * e.printStackTrace(); // ArithmeticException > RuntimeException;
		 */
		
		
	}
}
