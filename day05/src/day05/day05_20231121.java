package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class day05_20231121 {
	//static
	public static void CheckYourself(Scanner s) throws InputMismatchException {//숫자만 가능;;
		System.out.println("1.사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
		System.out.println("선택>>");
		int check = s.nextInt();
		if(check ==1){
			System.out.println("당신은 ENFP이당");
		}else {
			System.out.println("당신은 ISFP");
		}
		
	}
	public static void main(String[] args) {
	/*	try {
		Exception e = new Exception("고의발생 ㅎ ㅅㅎ");
		throw e;
		}catch(Exception e) {
			System.out.println("에러 메시지 : "+e.getMessage());
		}
			System.out.println("프로그램이 정상 종료되었습니다.");
*/
		/*
		 * scanner 문항을 주고 어떠낫람인지 번호를 선택하게 한다.
		 */
		Scanner s = new Scanner(System.in);
		/*
		 * 성격 유형 검사를 시작합니다 라는 멘트를 주고 검사를 시작함.
		 */
		System.out.println("성격 유형 검사를 시작 합니당.");
		/*
		 * static 메서드를 활용해서 지문에 대한 문항을 검사하는 메서드를 만든당.
		 */
		try {
		day05_20231121.CheckYourself(s);
		}catch(InputMismatchException e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		
		/*
		 * scan에 오류를 static 메서드에 던질 수 있게 매개변수로 만들어준다.
	*/
		}finally {
			if(s!=null) {
				s.close();			
			}
			System.out.println("프로그램 종료");
		}
	}
}
