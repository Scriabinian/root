package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multicatch {
	public static void main(String[] args) {
		/*
		 * 두가지 다중 catch를 만들어 보장.
		 * 배열을 만든다. cards = {4,5,1,2,7,8}
		 */
		Scanner s = new Scanner(System.in);
		
		try {

			int[] cards = {4,5,1,2,7,8};
			System.out.println(".몇번째 카드를 뽑으시겠습니까? >>");
			int cardIndex = s.nextInt();
			System.out.println("뽑은 카드 번호는 : "+cards[cardIndex]+" 입니다.");
		/*
		 * InputMismatchException : 입력이 잘못된 경우(scanner 에러)에 에러가 나는 예외처리.
		 */
		}catch(InputMismatchException e){
			System.out.println("잘못 입력하셨습니다. 스캐너에 입력할 때는 숫자만 가능합니당.");
		}catch(ArrayIndexOutOfBoundsException e) {
			/*
			 * 배열에 공간이 없는데 있다고 합니다.
			 */
			System.out.println("해당 번호의 카드는 없습니당.");
		}
		System.out.println("프로그램 종료");
		s.close();
		
	}
}
