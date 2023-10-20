package day4;
import java.util.*;

public class day04_20231020 {
	public static void main(String[] args) {
			int a = 25;
			switch(a/10) {
				case 2/10>=2?2:-1;
			}
		
		
		
			System.out.println("입력");
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			if(age>=19) {
				System.out.println("성인.");
			}else{
				System.out.println("미성녀자");
			}
			
			int a =4;
			int b= 10;
			int max = 0;
			max = a>b ? a:a<b?b:null;
			
			/*
			 *문제1 : 좋아하는 숫자를 선택 = 변수에 넣는다.
			 *1)좋아하는 숫자가 5보다 클 경우는 "좋아하는 숫자가 5보다 크다"라고 출력;
			 *2)좋아하는 숫자가 7일 경우에만 "좋아하는 숫자는 7입니다." 출력;
			 */
			String sd;
			Scanner s = new Scanner(System.in);
			int ni=s.nextInt();
			sd=ni>5?"5보다 크다":ni<5?"5보다 작다":"5와 같다.";
			System.out.println(sd);
			/*출력 결과 == number 7 입니다. 출력하자.
			 * switch 문은 변수의 값에 따라 실행문이 결정됨
			 * case 1 : number1 입니다. / case 7 : number7입니다.
			 * 디폴트 : 둘다 아니다 . break = 멈추고 빠져나감.
			 * 
			 */
			int result = 7;
			switch(result) {
			case 1:
				System.out.println("number1");
				break;
			case 7:
				System.out.println("number7");
				break;
			case 8:
				System.out.println("number8");
				break;
			default :
				System.out.println("둘다 아님");		
			}
			/*
			 * 월을 입력하고 계절을 출력함.
			 * case 3월부터 쓰고 11월까지만 쓰고 계절을 만들어보자.
			 * 
			 */
			Scanner month = new Scanner(System.in);
			switch(month.nextInt()) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄 입니다.");
				break;
			case 6:
			case 7:
			case 8:

				System.out.println("현재의 계절은 여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:

				System.out.println("현재의 계절은 가을 입니다.");
				break;	
			default :

				System.out.println("현재의 계절은 겨울 입니다.");
				
			}
			
			}
	}
/*
00	0000 0000  0000 0000  0000 0000  0000 0011
					
	*
	*
	*
	*
	*/
