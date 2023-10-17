package section1;
import java.util.Scanner;

public class java_20231017 {

	public static void main(String[] args) {
	
		double marathon = 42.195;
		float halfMarathon = 21.0975f;
		System.out.println("嶺뚮씭�쐞占쎈뎄�뜝�럥苑묈뜝�룞�삕 "+ marathon + "km �뜝�럥堉롳옙逾놂옙�윥占쎈퉵�뜝�럥堉�.");
		System.out.println("�뜝�럥由��뜝�럥�뒆 嶺뚮씭�쐞占쎈뎄�뜝�럥苑묈뜝�룞�삕 "+ halfMarathon + "km �뜝�럥堉롳옙逾놂옙�윥占쎈퉵�뜝�럥堉�.");
		
		double pieDouble = 3.141592653589793;
		float pieFloat = 3.141592653589793f;
		System.out.println(pieDouble);
		System.out.println(pieFloat);
	
		char alphabetA = 'A';
		char alphabetB = 'B';
		System.out.println((int)alphabetA+","+(int)alphabetB );
	
		boolean student = true;
		System.out.println(student+"ㅇㅇㅇ");
		/*
		 자동 형 변환
		 1.char=>short=>int=>long
		 2.정수=>소수
		 int형 num1 선언한다 14을 값을 저장하세요.
		 double 형 num2를 ㅅ건언하고 num1을 대입하세요.
		 */
		int num1 = 14;
		double num2 = num1;
		System.out.println(num2);
		//강제 형 변환
		
		int num3 = 10;
		byte num4 = (byte)num3;
		System.out.println(num4);
		
		int num5 = 1000;
		byte num6 = (byte)num5;
		System.out.println(num6);
		
		Scanner s = new Scanner(System.in);
		String name, address;
		int age;
		double weight;
		name = s.next();
		address = s.next();
		age = s.nextInt();
		weight = s.nextDouble();
		System.out.println("당신의 이름 : "+name + "입니다.");
		System.out.println("당신의 주소 : "+address + "입니다.");
		System.out.println("당신의 나이 : "+age + "입니다.");
		System.out.println("당신의 체중 : "+weight + "입니다.");
	
	}
}
