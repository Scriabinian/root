package day4;
import java.util.*;

public class day04_20231020 {
	public static void main(String[] args) {
			int a = 25;
			switch(a/10) {
				case 2/10>=2?2:-1;
			}
		
		
		
			System.out.println("�Է�");
			Scanner scanner = new Scanner(System.in);
			int age = scanner.nextInt();
			if(age>=19) {
				System.out.println("����.");
			}else{
				System.out.println("�̼�����");
			}
			
			int a =4;
			int b= 10;
			int max = 0;
			max = a>b ? a:a<b?b:null;
			
			/*
			 *����1 : �����ϴ� ���ڸ� ���� = ������ �ִ´�.
			 *1)�����ϴ� ���ڰ� 5���� Ŭ ���� "�����ϴ� ���ڰ� 5���� ũ��"��� ���;
			 *2)�����ϴ� ���ڰ� 7�� ��쿡�� "�����ϴ� ���ڴ� 7�Դϴ�." ���;
			 */
			String sd;
			Scanner s = new Scanner(System.in);
			int ni=s.nextInt();
			sd=ni>5?"5���� ũ��":ni<5?"5���� �۴�":"5�� ����.";
			System.out.println(sd);
			/*��� ��� == number 7 �Դϴ�. �������.
			 * switch ���� ������ ���� ���� ���๮�� ������
			 * case 1 : number1 �Դϴ�. / case 7 : number7�Դϴ�.
			 * ����Ʈ : �Ѵ� �ƴϴ� . break = ���߰� ��������.
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
				System.out.println("�Ѵ� �ƴ�");		
			}
			/*
			 * ���� �Է��ϰ� ������ �����.
			 * case 3������ ���� 11�������� ���� ������ ������.
			 * 
			 */
			Scanner month = new Scanner(System.in);
			switch(month.nextInt()) {
			case 3:
			case 4:
			case 5:
				System.out.println("������ ������ �� �Դϴ�.");
				break;
			case 6:
			case 7:
			case 8:

				System.out.println("������ ������ ���� �Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:

				System.out.println("������ ������ ���� �Դϴ�.");
				break;	
			default :

				System.out.println("������ ������ �ܿ� �Դϴ�.");
				
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
